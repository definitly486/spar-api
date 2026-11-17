package ru.myspar.proloyalty.support_service.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lru/myspar/proloyalty/support_service/impl/domain/model/SupportInfo;", "Landroid/os/Parcelable;", "", "picUrl", "title", "subtitle", "", "Lru/myspar/proloyalty/support_service/impl/domain/model/SupportAction;", "actions", "Lru/myspar/proloyalty/support_service/impl/domain/model/FAQItem;", "faqs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "cqumvgiudr", "ppxfxbqfkf", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportInfo implements Parcelable {
    public static final Parcelable.Creator<SupportInfo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List faqs;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List actions;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picUrl;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SupportInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(SupportAction.CREATOR.createFromParcel(parcel));
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(FAQItem.CREATOR.createFromParcel(parcel));
            }
            return new SupportInfo(string, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SupportInfo[] newArray(int i13) {
            return new SupportInfo[i13];
        }
    }

    public SupportInfo(String picUrl, String title, String subtitle, List actions, List faqs) {
        zdlpuopuiu.btonecajqb(picUrl, "picUrl");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(actions, "actions");
        zdlpuopuiu.btonecajqb(faqs, "faqs");
        this.picUrl = picUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.actions = actions;
        this.faqs = faqs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportInfo)) {
            return false;
        }
        SupportInfo supportInfo = (SupportInfo) other;
        return zdlpuopuiu.eablkybsjg(this.picUrl, supportInfo.picUrl) && zdlpuopuiu.eablkybsjg(this.title, supportInfo.title) && zdlpuopuiu.eablkybsjg(this.subtitle, supportInfo.subtitle) && zdlpuopuiu.eablkybsjg(this.actions, supportInfo.actions) && zdlpuopuiu.eablkybsjg(this.faqs, supportInfo.faqs);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return (((((((this.picUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.faqs.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getFaqs() {
        return this.faqs;
    }

    public String toString() {
        return "SupportInfo(picUrl=" + this.picUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actions=" + this.actions + ", faqs=" + this.faqs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.picUrl);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        List list = this.actions;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((SupportAction) it.next()).writeToParcel(dest, flags);
        }
        List list2 = this.faqs;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FAQItem) it2.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getActions() {
        return this.actions;
    }
}
