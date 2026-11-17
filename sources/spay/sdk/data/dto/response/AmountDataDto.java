package spay.sdk.data.dto.response;

import kk.ir;
import kk.j80;
import kk.m90;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lspay/sdk/data/dto/response/AmountDataDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "amount", "", "currency", "", "(JLjava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AmountDataDto implements DataDtoInterface<ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData> {

    @ppxfxbqfkf("amount")
    private final long amount;

    @ppxfxbqfkf("currency")
    private final String currency;

    public AmountDataDto(long j13, String currency) {
        zdlpuopuiu.btonecajqb(currency, "currency");
        this.amount = j13;
        this.currency = currency;
    }

    public static /* synthetic */ AmountDataDto copy$default(AmountDataDto amountDataDto, long j13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j13 = amountDataDto.amount;
        }
        if ((i13 & 2) != 0) {
            str = amountDataDto.currency;
        }
        return amountDataDto.copy(j13, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final AmountDataDto copy(long amount, String currency) {
        zdlpuopuiu.btonecajqb(currency, "currency");
        return new AmountDataDto(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountDataDto)) {
            return false;
        }
        AmountDataDto amountDataDto = (AmountDataDto) other;
        return this.amount == amountDataDto.amount && zdlpuopuiu.eablkybsjg(this.currency, amountDataDto.currency);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public String toString() {
        return "AmountDataDto(amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData toModel() {
        long j13 = this.amount;
        j80 onDebug = new j80(j13);
        m90 onRelease = new m90(j13);
        zdlpuopuiu.btonecajqb(onDebug, "onDebug");
        zdlpuopuiu.btonecajqb(onRelease, "onRelease");
        String strIobyxmoadg = ir.iobyxmoadg(this.currency);
        zdlpuopuiu.btonecajqb(strIobyxmoadg, "<this>");
        if (kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) {
            strIobyxmoadg = "₽";
        }
        return new ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData(j13, strIobyxmoadg);
    }
}
