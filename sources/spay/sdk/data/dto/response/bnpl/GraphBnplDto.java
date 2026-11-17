package spay.sdk.data.dto.response.bnpl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/GraphBnplDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "header", "", "content", "count", "text", "payments", "", "Lspay/sdk/data/dto/response/bnpl/BnplPaymentDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getPayments", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GraphBnplDto implements DataDtoInterface<GraphBnpl> {

    @ppxfxbqfkf("content")
    private final String content;

    @ppxfxbqfkf("count")
    private final String count;

    @ppxfxbqfkf("header")
    private final String header;

    @ppxfxbqfkf("payments")
    private final List<BnplPaymentDto> payments;

    @ppxfxbqfkf("text")
    private final String text;

    public GraphBnplDto(String str, String str2, String str3, String str4, List<BnplPaymentDto> list) {
        this.header = str;
        this.content = str2;
        this.count = str3;
        this.text = str4;
        this.payments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphBnplDto copy$default(GraphBnplDto graphBnplDto, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphBnplDto.header;
        }
        if ((i13 & 2) != 0) {
            str2 = graphBnplDto.content;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = graphBnplDto.count;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            str4 = graphBnplDto.text;
        }
        String str7 = str4;
        if ((i13 & 16) != 0) {
            list = graphBnplDto.payments;
        }
        return graphBnplDto.copy(str, str5, str6, str7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<BnplPaymentDto> component5() {
        return this.payments;
    }

    public final GraphBnplDto copy(String header, String content, String count, String text, List<BnplPaymentDto> payments) {
        return new GraphBnplDto(header, content, count, text, payments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphBnplDto)) {
            return false;
        }
        GraphBnplDto graphBnplDto = (GraphBnplDto) other;
        return zdlpuopuiu.eablkybsjg(this.header, graphBnplDto.header) && zdlpuopuiu.eablkybsjg(this.content, graphBnplDto.content) && zdlpuopuiu.eablkybsjg(this.count, graphBnplDto.count) && zdlpuopuiu.eablkybsjg(this.text, graphBnplDto.text) && zdlpuopuiu.eablkybsjg(this.payments, graphBnplDto.payments);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCount() {
        return this.count;
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<BnplPaymentDto> getPayments() {
        return this.payments;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.count;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BnplPaymentDto> list = this.payments;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GraphBnplDto(header=" + this.header + ", content=" + this.content + ", count=" + this.count + ", text=" + this.text + ", payments=" + this.payments + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public GraphBnpl toModel() {
        String str = this.header;
        if (str == null) {
            throw new pd("header");
        }
        String str2 = this.content;
        if (str2 == null) {
            throw new pd("content");
        }
        String str3 = this.count;
        String str4 = this.text;
        List<BnplPaymentDto> list = this.payments;
        return new GraphBnpl(str, str2, str3, str4, list != null ? GraphBnplDtoKt.toModelList(list) : null);
    }

    public /* synthetic */ GraphBnplDto(String str, String str2, String str3, String str4, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : list);
    }
}
