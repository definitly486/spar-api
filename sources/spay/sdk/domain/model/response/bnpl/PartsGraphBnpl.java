package spay.sdk.domain.model.response.bnpl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", "Landroid/os/Parcelable;", "", "header", "content", "count", "text", "", "Lspay/sdk/domain/model/response/bnpl/SixPartPay;", "sixPartPay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getContent", "getCount", "getText", "Ljava/util/List;", "getSixPartPay", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartsGraphBnpl implements Parcelable {
    public static final Parcelable.Creator<PartsGraphBnpl> CREATOR = new Creator();
    private final String content;
    private final String count;
    private final String header;
    private final List<SixPartPay> sixPartPay;
    private final String text;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartsGraphBnpl> {
        @Override // android.os.Parcelable.Creator
        public final PartsGraphBnpl createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(SixPartPay.CREATOR.createFromParcel(parcel));
            }
            return new PartsGraphBnpl(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PartsGraphBnpl[] newArray(int i13) {
            return new PartsGraphBnpl[i13];
        }
    }

    public PartsGraphBnpl(String header, String content, String str, String str2, List<SixPartPay> sixPartPay) {
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(sixPartPay, "sixPartPay");
        this.header = header;
        this.content = content;
        this.count = str;
        this.text = str2;
        this.sixPartPay = sixPartPay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartsGraphBnpl copy$default(PartsGraphBnpl partsGraphBnpl, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = partsGraphBnpl.header;
        }
        if ((i13 & 2) != 0) {
            str2 = partsGraphBnpl.content;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = partsGraphBnpl.count;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            str4 = partsGraphBnpl.text;
        }
        String str7 = str4;
        if ((i13 & 16) != 0) {
            list = partsGraphBnpl.sixPartPay;
        }
        return partsGraphBnpl.copy(str, str5, str6, str7, list);
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

    public final List<SixPartPay> component5() {
        return this.sixPartPay;
    }

    public final PartsGraphBnpl copy(String header, String content, String count, String text, List<SixPartPay> sixPartPay) {
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(sixPartPay, "sixPartPay");
        return new PartsGraphBnpl(header, content, count, text, sixPartPay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartsGraphBnpl)) {
            return false;
        }
        PartsGraphBnpl partsGraphBnpl = (PartsGraphBnpl) other;
        return zdlpuopuiu.eablkybsjg(this.header, partsGraphBnpl.header) && zdlpuopuiu.eablkybsjg(this.content, partsGraphBnpl.content) && zdlpuopuiu.eablkybsjg(this.count, partsGraphBnpl.count) && zdlpuopuiu.eablkybsjg(this.text, partsGraphBnpl.text) && zdlpuopuiu.eablkybsjg(this.sixPartPay, partsGraphBnpl.sixPartPay);
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

    public final List<SixPartPay> getSixPartPay() {
        return this.sixPartPay;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.content, this.header.hashCode() * 31, 31);
        String str = this.count;
        int iHashCode = (iIobyxmoadg + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return this.sixPartPay.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PartsGraphBnpl(header=" + this.header + ", content=" + this.content + ", count=" + this.count + ", text=" + this.text + ", sixPartPay=" + this.sixPartPay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.header);
        parcel.writeString(this.content);
        parcel.writeString(this.count);
        parcel.writeString(this.text);
        List<SixPartPay> list = this.sixPartPay;
        parcel.writeInt(list.size());
        Iterator<SixPartPay> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PartsGraphBnpl(String str, String str2, String str3, String str4, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, list);
    }
}
