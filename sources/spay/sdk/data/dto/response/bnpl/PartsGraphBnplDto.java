package spay.sdk.data.dto.response.bnpl;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.PartsGraphBnpl;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/PartsGraphBnplDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", "header", "", "content", "count", "text", "singleProductSixPart", "", "Lspay/sdk/data/dto/response/bnpl/SixPartPayDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getSingleProductSixPart", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartsGraphBnplDto implements DataDtoInterface<PartsGraphBnpl> {

    @ppxfxbqfkf("content")
    private final String content;

    @ppxfxbqfkf("count")
    private final String count;

    @ppxfxbqfkf("header")
    private final String header;

    @ppxfxbqfkf("singleProductSixPart")
    private final List<SixPartPayDto> singleProductSixPart;

    @ppxfxbqfkf("text")
    private final String text;

    public PartsGraphBnplDto(String str, String str2, String str3, String str4, List<SixPartPayDto> singleProductSixPart) {
        zdlpuopuiu.btonecajqb(singleProductSixPart, "singleProductSixPart");
        this.header = str;
        this.content = str2;
        this.count = str3;
        this.text = str4;
        this.singleProductSixPart = singleProductSixPart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartsGraphBnplDto copy$default(PartsGraphBnplDto partsGraphBnplDto, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = partsGraphBnplDto.header;
        }
        if ((i13 & 2) != 0) {
            str2 = partsGraphBnplDto.content;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = partsGraphBnplDto.count;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            str4 = partsGraphBnplDto.text;
        }
        String str7 = str4;
        if ((i13 & 16) != 0) {
            list = partsGraphBnplDto.singleProductSixPart;
        }
        return partsGraphBnplDto.copy(str, str5, str6, str7, list);
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

    public final List<SixPartPayDto> component5() {
        return this.singleProductSixPart;
    }

    public final PartsGraphBnplDto copy(String header, String content, String count, String text, List<SixPartPayDto> singleProductSixPart) {
        zdlpuopuiu.btonecajqb(singleProductSixPart, "singleProductSixPart");
        return new PartsGraphBnplDto(header, content, count, text, singleProductSixPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartsGraphBnplDto)) {
            return false;
        }
        PartsGraphBnplDto partsGraphBnplDto = (PartsGraphBnplDto) other;
        return zdlpuopuiu.eablkybsjg(this.header, partsGraphBnplDto.header) && zdlpuopuiu.eablkybsjg(this.content, partsGraphBnplDto.content) && zdlpuopuiu.eablkybsjg(this.count, partsGraphBnplDto.count) && zdlpuopuiu.eablkybsjg(this.text, partsGraphBnplDto.text) && zdlpuopuiu.eablkybsjg(this.singleProductSixPart, partsGraphBnplDto.singleProductSixPart);
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

    public final List<SixPartPayDto> getSingleProductSixPart() {
        return this.singleProductSixPart;
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
        return this.singleProductSixPart.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PartsGraphBnplDto(header=" + this.header + ", content=" + this.content + ", count=" + this.count + ", text=" + this.text + ", singleProductSixPart=" + this.singleProductSixPart + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public PartsGraphBnpl toModel() {
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
        List<SixPartPayDto> list = this.singleProductSixPart;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SixPartPayDto) it.next()).toModel());
        }
        return new PartsGraphBnpl(str, str2, str3, str4, arrayList);
    }
}
