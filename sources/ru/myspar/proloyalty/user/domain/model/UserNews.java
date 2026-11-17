package ru.myspar.proloyalty.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/user/domain/model/UserNews;", "Landroid/os/Parcelable;", "", "discounts", "notifications", "chatSupportMessages", "", "hasActiveDiscount", "<init>", "(IIIZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "ppxfxbqfkf", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "Z", "eablkybsjg", "()Z", "cqumvgiudr", "iobyxmoadg", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserNews implements Parcelable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasActiveDiscount;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int chatSupportMessages;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int notifications;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int discounts;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UserNews> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.user.domain.model.UserNews$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final UserNews iobyxmoadg() {
            return new UserNews(0, 0, 0, false);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserNews createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserNews(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserNews[] newArray(int i13) {
            return new UserNews[i13];
        }
    }

    public UserNews(int i13, int i14, int i15, boolean z13) {
        this.discounts = i13;
        this.notifications = i14;
        this.chatSupportMessages = i15;
        this.hasActiveDiscount = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getHasActiveDiscount() {
        return this.hasActiveDiscount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserNews)) {
            return false;
        }
        UserNews userNews = (UserNews) other;
        return this.discounts == userNews.discounts && this.notifications == userNews.notifications && this.chatSupportMessages == userNews.chatSupportMessages && this.hasActiveDiscount == userNews.hasActiveDiscount;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.discounts) * 31) + Integer.hashCode(this.notifications)) * 31) + Integer.hashCode(this.chatSupportMessages)) * 31) + Boolean.hashCode(this.hasActiveDiscount);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getDiscounts() {
        return this.discounts;
    }

    public String toString() {
        return "UserNews(discounts=" + this.discounts + ", notifications=" + this.notifications + ", chatSupportMessages=" + this.chatSupportMessages + ", hasActiveDiscount=" + this.hasActiveDiscount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.discounts);
        dest.writeInt(this.notifications);
        dest.writeInt(this.chatSupportMessages);
        dest.writeInt(this.hasActiveDiscount ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getChatSupportMessages() {
        return this.chatSupportMessages;
    }
}
