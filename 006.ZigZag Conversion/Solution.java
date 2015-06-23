package com.asiainfo.crm.flow.exe.tf;

import java.util.HashMap;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.center.CenterFactory;
import com.asiainfo.appframe.ext.exeframe.tf.TfFrameWork;
import com.asiainfo.appframe.ext.exeframe.tf.interfaces.IAdvanceTransform;
import com.asiainfo.crm.flow.FlowConst;
import com.asiainfo.crm.flow.FlowFactory;
import com.asiainfo.crm.flow.bo.BOFmBusiTaskErrBean;
import com.asiainfo.crm.flow.ivalues.IBOFmBusiTaskErrValue;

/**
 * @author zhangchi5
 * 2015-06-18
 *
 */
public class FmBusiTaskErrToSrcTF implements IAdvanceTransform{
	
	private static transient org.apache.commons.logging.Log log = LogFactory.getLog(FmBusiTaskErrToSrcTF.class);
	@Override
	public boolean isSelfSrcFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void srcFinish(HashMap[] ahashmap) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelfHisFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void hisFinish(HashMap[] ahashmap) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelfDestFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void destFinish(HashMap[] ahashmap) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void transform(HashMap[] maps) throws Exception {
		if(maps==null||maps.length==0){
			log.debug("FmBusiTaskErrToSrcTF获取到的数据为空，不做处理！");
			throw new Exception("FmBusiTaskErrToSrcTF获取到的数据为空，不做处理！");
		}
		
		//设置中心
		String regionId = maps[0].get(FlowConst.EsbNodeName.REGION_ID).toString();
		CenterFactory.setCenterInfoByTypeAndValue("RegionId",regionId);
		
		IBOFmBusiTaskErrValue boFmBusiTaskErrValue = new BOFmBusiTaskErrBean();
		
		for(int i=0;i<maps.length;i++){
			
			boFmBusiTaskErrValue.setServiceCode(maps[i].get(IBOFmBusiTaskErrValue.S_ServiceCode).toString());			
			boFmBusiTaskErrValue.setNetType(maps[i].get(IBOFmBusiTaskErrValue.S_NetType).toString());
			boFmBusiTaskErrValue.setServiceType(maps[i].get(IBOFmBusiTaskErrValue.S_ServiceType).toString());
			boFmBusiTaskErrValue.setBusiType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_BusiType)));
			boFmBusiTaskErrValue.setIsBilling(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_IsBilling)));
			boFmBusiTaskErrValue.setAgentCode(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_AgentCode)));
			boFmBusiTaskErrValue.setAgentMode(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_AgentMode)));
			boFmBusiTaskErrValue.setAgentPassword(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_AgentPassword)));
			boFmBusiTaskErrValue.setAgentType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_AgentType)));			
			boFmBusiTaskErrValue.setOrgSoDate(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_OrgSoDate)));
			boFmBusiTaskErrValue.setPayTime(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_PayTime)));
			boFmBusiTaskErrValue.setExtDoneCode(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_ExtDoneCode)));
			boFmBusiTaskErrValue.setIsPrintInvoice(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_IsPrintInvoice)));
			boFmBusiTaskErrValue.setBizCode(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_BizCode)));
			boFmBusiTaskErrValue.setOriginType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_OriginType)));			
			boFmBusiTaskErrValue.setRegionId(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_RegionId)));
			boFmBusiTaskErrValue.setChannelType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_ChannelType)));			
			boFmBusiTaskErrValue.setOpCode(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_OpCode)));		
			boFmBusiTaskErrValue.setRemarks(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Remarks)));		
			boFmBusiTaskErrValue.setErrMsg(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_ErrMsg)));
			boFmBusiTaskErrValue.setEffectiveType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_EffectiveType)));
			boFmBusiTaskErrValue.setExpireType(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_ExpireType)));
			boFmBusiTaskErrValue.setSystemOpId(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_SystemOpId)));
			boFmBusiTaskErrValue.setEx1(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Ex1)));
			boFmBusiTaskErrValue.setEx2(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Ex2)));
			boFmBusiTaskErrValue.setEx3(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Ex3)));
			boFmBusiTaskErrValue.setEx4(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Ex4)));
			boFmBusiTaskErrValue.setEx5(DataType.getAsString(maps[i].get(IBOFmBusiTaskErrValue.S_Ex5)));
			
			boFmBusiTaskErrValue.setCreateDate(DataType.getAsDateTime(maps[i].get(IBOFmBusiTaskErrValue.S_CreateDate)));
			boFmBusiTaskErrValue.setEffectiveDate(DataType.getAsDateTime(maps[i].get(IBOFmBusiTaskErrValue.S_EffectiveDate)));
			boFmBusiTaskErrValue.setExpireDate(DataType.getAsDateTime(maps[i].get(IBOFmBusiTaskErrValue.S_ExpireDate)));
			boFmBusiTaskErrValue.setErrDate(DataType.getAsDateTime(maps[i].get(IBOFmBusiTaskErrValue.S_ErrDate)));
			
			long busiTaskId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_BusiTaskId));
			long businessId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_BusinessId));
			long errCount = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_ErrorCount));
			long offerNums = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_OfferNums));
			long opId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_OpId));
			long orgId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_OrgId));
			long payAmount = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_PayAmount));
			long offerId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_OfferId));
			long resItemId = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_ResItemId));
			long resAmount = DataType.getAsLong(maps[i].get(IBOFmBusiTaskErrValue.S_ResAmount));
			if(busiTaskId>0){
				boFmBusiTaskErrValue.setBusiTaskId(busiTaskId);
			}
			if(businessId>0){
				boFmBusiTaskErrValue.setBusiTaskId(businessId);
			}
			if(errCount>0){
				boFmBusiTaskErrValue.setBusiTaskId(errCount);
			}
			if(offerNums>0){
				boFmBusiTaskErrValue.setBusiTaskId(offerNums);
			}
			if(opId>0){
				boFmBusiTaskErrValue.setBusiTaskId(opId);
			}
			if(orgId>0){
				boFmBusiTaskErrValue.setBusiTaskId(orgId);
			}
			if(payAmount>0){
				boFmBusiTaskErrValue.setBusiTaskId(payAmount);
			}
			if(offerId>0){
				boFmBusiTaskErrValue.setBusiTaskId(offerId);
			}
			if(resItemId>0){
				boFmBusiTaskErrValue.setBusiTaskId(resItemId);
			}
			if(resAmount>0){
				boFmBusiTaskErrValue.setBusiTaskId(resAmount);
			}
<<<<<<< .mine
			try {
				FlowFactory.getIFmBusiTaskErrSV().transErrDate(boFmBusiTaskErrValue);
			} catch (Exception e) {				
				e.printStackTrace();
			}
=======
			
			try{
				FlowFactory.getIFmBusiTaskErrSV().transErrDate(boFmBusiTaskErrValue);
			}catch(Exception e){
				FlowFactory.getIFmBusiTaskErrSV().errDethod(boFmBusiTaskErrValue);
				log.error(e);
				throw e;
			}
>>>>>>> .r137050
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		TfFrameWork.main(new String[]{"FM_BUSI_TASK_ERRTOSRC_571","1","0"});

	}
}

