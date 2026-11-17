package ru.myspar.proloyalty.core.domain.models.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u001a8\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u001d\u00106\u001a\u00020\u001a8\u0006¢\u0006\u0012\n\u0004\b3\u0010-\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010/¨\u00069"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/push/NotificationModel;", "Landroid/os/Parcelable;", "", "id", "title", "body", "action", "reference", "Ljava/time/LocalDateTime;", "dateFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "zoijcleaow", "cqumvgiudr", "gxszxtbevo", "esjtqupxsv", "Ljava/time/LocalDateTime;", "eablkybsjg", "()Ljava/time/LocalDateTime;", "lereixgezr", "Z", "dxjokdxxww", "()Z", "isPromoCopyAction$annotations", "()V", "isPromoCopyAction", "pmvmpeiblj", "nufgyqmvbu", "isPromoAction$annotations", "isPromoAction", "zynmafqrjb", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NotificationModel implements Parcelable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime dateFrom;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String action;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final boolean isPromoCopyAction;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final boolean isPromoAction;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;
    public static final Parcelable.Creator<NotificationModel> CREATOR = new zoijcleaow();

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final NotificationModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new NotificationModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final NotificationModel[] newArray(int i13) {
            return new NotificationModel[i13];
        }
    }

    public NotificationModel(String id2, String title, String body, String action, String reference, LocalDateTime dateFrom) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(body, "body");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(dateFrom, "dateFrom");
        this.id = id2;
        this.title = title;
        this.body = body;
        this.action = action;
        this.reference = reference;
        this.dateFrom = dateFrom;
        this.isPromoCopyAction = zdlpuopuiu.eablkybsjg(action, "promocopy");
        this.isPromoAction = zdlpuopuiu.eablkybsjg(action, "promo");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsPromoCopyAction() {
        return this.isPromoCopyAction;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final LocalDateTime getDateFrom() {
        return this.dateFrom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationModel)) {
            return false;
        }
        NotificationModel notificationModel = (NotificationModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, notificationModel.id) && zdlpuopuiu.eablkybsjg(this.title, notificationModel.title) && zdlpuopuiu.eablkybsjg(this.body, notificationModel.body) && zdlpuopuiu.eablkybsjg(this.action, notificationModel.action) && zdlpuopuiu.eablkybsjg(this.reference, notificationModel.reference) && zdlpuopuiu.eablkybsjg(this.dateFrom, notificationModel.dateFrom);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.action.hashCode()) * 31) + this.reference.hashCode()) * 31) + this.dateFrom.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsPromoAction() {
        return this.isPromoAction;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public String toString() {
        return "NotificationModel(id=" + this.id + ", title=" + this.title + ", body=" + this.body + ", action=" + this.action + ", reference=" + this.reference + ", dateFrom=" + this.dateFrom + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.action);
        dest.writeString(this.reference);
        dest.writeSerializable(this.dateFrom);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAction() {
        return this.action;
    }
}
