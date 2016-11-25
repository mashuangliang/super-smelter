//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.smelter.constant;

public enum ResponseCode {
    OK(200, "OK"),
    ERROR(-1, "ERROR"),
    MISS_PARAM(1001, "缺少必要参数"),
    ERROR_CODE(1002, "验证码错误"),
    FAIL_REG(2000, "手机号已注册，请重新输入"),
    FAIL_LONGIN(2001, "用户名或密码错误，请重新输入"),
    USERLOGINERROR_AUTHFAIL(2002, "用户名未激活，请联系客服"),
    LOGGOUTERROR(2003, "注销失败"),
    FINDPASSWORDTIP(2004, "找回密码，请联系客服"),
    PASSWORDLENTHERROR(2005, "密码不能少于6位"),
    MODIFYPASSWORDERROR(2006, "修改密码失败"),
    NULL_USER(2007, "用户不存在，请联系客服"),
    OTHER_DEVICE_FOR_LONGIN(2008, "账号已在其他设备登录"),
    TOKEN_ERROR(2009, "请重新登录"),
    USERAREA_NOTEXIST(2010, "用户未设置盟商区域，请联系客服"),
    USERLOGIN_FAIL(2011, "用户登录失败，请联系客服"),
    USERLOGIN_NOTPERMIT(2012, "权限不足请联系管理员"),
    UID_EMPTY(2013, "用户id未获取到"),
    CARDID_EMPTY(2013, "银行卡号未获取到"),
    TYPE_EMPTY(2013, "绑定类型未获取到"),
    TRADEPWD_ERROR(2014, "交易密码错误"),
    SETUSERHEARDERROR(3001, "设置头像出错"),
    UPLOADUSERHEARDERROR(3002, "上传失败"),
    SUBMITDUNALBUMERROR(3003, "生成催收相册失败"),
    SUBMITDUANPHOTOERROR(3004, "催收图片上传图片平台失败"),
    SAVEDUANPHOTOERROR(3004, "催收图片上传保存失败"),
    JOBLOCK(3005, "任务已锁定"),
    FAIL_NETWORK(4000, "网络繁忙请稍后再试"),
    GETDATEERROR(4001, "获取数据异常"),
    SETDATEERROR(4002, "保存数据异常"),
    NULL_DATA(4003, "记录已不存在，请刷新列表"),
    PAY_ALLCHANNELCLOSE_ERROR(6000, "系统异常:所有通道都已经关闭，请联系管理员!"),
    PAY_NOCHANNEL_ERROR(6001, "无可用通道:所有通道10分钟错误次数超过2次!"),
    PAY_SINGLEABOVE_ERROR(6002, "无可用通道:单笔交易金额超限，请降低充值金额后重试!"),
    PAY_DAYBOVE_ERROR(6003, "无可用通道:单日交易金额超限，请降低充值金额后重试!"),
    PAY_MONTHBOVE_ERROR(6004, "无可用通道:单月交易金额超限，请降低充值金额后重试!"),
    PAY_NOUSECHANNEL_ERROR(6005, "无可用通道:当前银行无可用通道，请联系管理员!"),
    PAY_MESSAGE_ERROR(6006, "持卡人信息有误！"),
    PAY_TIMEOUT_ERROR(6007, "银行卡已过有效期，请联系发卡行！"),
    PAY_BALANCENOTENOUGH_ERROR(6008, "账户余额不足！"),
    PAY_BALANABOVECENOTLIMIT_ERROR(6009, "交易金额超过通道限额！"),
    PAY_MESSAGECODE_ERROR(6010, "短信验证码错误！"),
    PAY_UNBINDBANKCARDHASMONEY_ERROR(6011, "该银行卡因还有金额未提走不可删除"),
    PAY_MONEYBIG_ERROR(6012, ""),
    PAY_FREEZING_ERROR(6013, "您的账户已被冻结不能充值，如有疑问请联系客服"),
    PAY_MONEYEXCEPTION_ERROR(6014, "您的账号有异常行为，本笔充值需为100元或以上，如有疑问请联系客服"),
    PAY_PAYCALLBACKNOSUCHORDER_ERROR(6015, "本次资金流水不存在"),
    PAY_SAMEBANKNO_ERROR(6016, "与绑定的银行卡不一致"),
    PAY_PAYCALLBACKMESSAGEERROR_ERROR(6017, "回调消息错误"),
    PAY_TIMELIMIT_ERROR(6018, ""),
    PAY_NOCHANNELS_ERROR(6019, "没有可使用的充值通道"),
    PAY_PAYMONEYABOVE_ERROR(6020, ""),
    PAY_PAYCHANNEL_ERROR(6021, "非法支付渠道");

    private String msg;
    private int code;

    private ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

    public ResponseCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
