package com.lawu.compensating.transaction;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawu.compensating.transaction.annotation.CompensatingTransactionFollow;
import com.lawu.compensating.transaction.domain.ProductModelInventoryDO;
import com.lawu.compensating.transaction.domain.ProductModelInventoryDOExample;
import com.lawu.compensating.transaction.mapper.ProductModelInventoryDOMapper;
import com.lawu.compensating.transaction.mapper.extend.SeckillActivityProductDOExtendMapper;
import com.lawu.compensating.transaction.service.impl.AbstractTransactionFollowService;

/**
 * 
 * @author jiangxinjun
 * @createDate 2017年12月25日
 * @updateDate 2017年12月25日
 */
@Service
@CompensatingTransactionFollow(topic = TransactionTest.TOPIC, tags = TransactionTest.TAGS)
public class TestTransactionFollowServiceImpl extends AbstractTransactionFollowService<TestNotification, TestReply> {

    @Autowired
    private SeckillActivityProductDOExtendMapper seckillActivityProductDOExtendMapper;
    
    @Autowired
    private ProductModelInventoryDOMapper productModelInventoryDOMapper;
    
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void execute(TestNotification notification) {
	    int affectedRows = seckillActivityProductDOExtendMapper.subtractInventory(notification.getSeckillActivityProductId(), notification.getQuantity());
	    if (affectedRows > 0) {
	        ProductModelInventoryDO record = new ProductModelInventoryDO();
	        record.setGmtCreate(new Date());
	        record.setGmtModified(new Date());
	        record.setProductModelId(notification.getSeckillActivityProductId());
	        record.setType((byte) 0x02);
	        record.setQuantity(notification.getQuantity());
	        record.setShoppingOrderId(notification.getShoppingOrderId());
	        productModelInventoryDOMapper.insert(record);
	    }
	}
	
	@Override
	public TestReply getReply(TestNotification notification) {
	    TestReply testReply = new TestReply();
	    ProductModelInventoryDOExample example = new ProductModelInventoryDOExample();
	    example.createCriteria().andShoppingOrderIdEqualTo(notification.getShoppingOrderId()).andProductModelIdEqualTo(notification.getSeckillActivityProductId());
	    long count = productModelInventoryDOMapper.countByExample(example);
	    if (count == 1) {
	        testReply.setIsSuccess(true);
	    } else {
	        testReply.setIsSuccess(false);
	    }
	    return testReply;
	}
}
