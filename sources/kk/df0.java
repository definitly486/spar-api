package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum df0 implements io {
    MA_INIT("MAInit"),
    /* JADX INFO: Fake field, exist only in values array */
    MA_IS_READY_FOR_SPAY("MAIsReadyForSpay"),
    /* JADX INFO: Fake field, exist only in values array */
    MAC_IS_READY_FOR_SPAY("MACIsReadyForSpay"),
    MACPay("MACPay"),
    /* JADX INFO: Fake field, exist only in values array */
    MA_COMPLETE_PAYMENT("MACompletePayment"),
    /* JADX INFO: Fake field, exist only in values array */
    MAC_COMPLETE_PAYMENT("MACCompletePayment"),
    EX_PAY("EXPay"),
    MA_PAY_DEFAULT("MAPayDefault"),
    MA_PAY_WITH_BANK_INVOICE_ID("MAPayWithBankInvoiceId"),
    MA_PAY_WITH_BINDING("MAPayWithBinding"),
    MA_PAY_WITH_BONUSES("MAPayWithBonuses"),
    MA_PAY_WITH_PART_PAY("MAPayWithPartPay"),
    MA_PAY_WITH_PAYMENT_ACCOUNT("MAPayWithPaymentAccount"),
    MA_PAY_WITH_PHONE_NUMBER("MAPayWithPhoneNumber"),
    MA_PAY_WITHOUT_REFRESH("MAPayWithoutRefresh");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f56280zdlpuopuiu;

    df0(String str) {
        this.f56280zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f56280zdlpuopuiu;
    }
}
