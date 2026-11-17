package ru.myspar.proloyalty.core.models.progress_bar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/core/models/progress_bar/CartProgressBarRapid;", "Landroid/os/Parcelable;", "", "imageUrl", "title", "", "messageList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ojitshcjhn", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartProgressBarRapid implements Parcelable {
    public static final Parcelable.Creator<CartProgressBarRapid> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List messageList;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartProgressBarRapid createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CartProgressBarRapid(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartProgressBarRapid[] newArray(int i13) {
            return new CartProgressBarRapid[i13];
        }
    }

    public CartProgressBarRapid(String imageUrl, String title, List messageList) {
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(messageList, "messageList");
        this.imageUrl = imageUrl;
        this.title = title;
        this.messageList = messageList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProgressBarRapid)) {
            return false;
        }
        CartProgressBarRapid cartProgressBarRapid = (CartProgressBarRapid) other;
        return zdlpuopuiu.eablkybsjg(this.imageUrl, cartProgressBarRapid.imageUrl) && zdlpuopuiu.eablkybsjg(this.title, cartProgressBarRapid.title) && zdlpuopuiu.eablkybsjg(this.messageList, cartProgressBarRapid.messageList);
    }

    public int hashCode() {
        return (((this.imageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.messageList.hashCode();
    }

    /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "CartProgressBarRapid(imageUrl=" + this.imageUrl + ", title=" + this.title + ", messageList=" + this.messageList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeStringList(this.messageList);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getMessageList() {
        return this.messageList;
    }
}
