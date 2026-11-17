package ru.myspar.core.models.paging;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lru/myspar/core/models/paging/Paging;", "Landroid/os/Parcelable;", "", "itemsCount", "itemsOnPageCount", "pagesCount", "<init>", "(III)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "eablkybsjg", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Paging implements Parcelable {
    public static final Parcelable.Creator<Paging> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pagesCount;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemsOnPageCount;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemsCount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Paging createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new Paging(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Paging[] newArray(int i13) {
            return new Paging[i13];
        }
    }

    public Paging(int i13, int i14, int i15) {
        this.itemsCount = i13;
        this.itemsOnPageCount = i14;
        this.pagesCount = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getPagesCount() {
        return this.pagesCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paging)) {
            return false;
        }
        Paging paging = (Paging) other;
        return this.itemsCount == paging.itemsCount && this.itemsOnPageCount == paging.itemsOnPageCount && this.pagesCount == paging.pagesCount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.itemsCount) * 31) + Integer.hashCode(this.itemsOnPageCount)) * 31) + Integer.hashCode(this.pagesCount);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getItemsOnPageCount() {
        return this.itemsOnPageCount;
    }

    public String toString() {
        return "Paging(itemsCount=" + this.itemsCount + ", itemsOnPageCount=" + this.itemsOnPageCount + ", pagesCount=" + this.pagesCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.itemsCount);
        dest.writeInt(this.itemsOnPageCount);
        dest.writeInt(this.pagesCount);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getItemsCount() {
        return this.itemsCount;
    }

    public /* synthetic */ Paging(int i13, int i14, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
    }
}
