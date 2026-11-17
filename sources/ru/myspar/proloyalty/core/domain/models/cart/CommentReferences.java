package ru.myspar.proloyalty.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/CommentReferences;", "Landroid/os/Parcelable;", "", "code", "title", "", "Lru/myspar/proloyalty/core/domain/models/reference/Reference;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/myspar/proloyalty/core/domain/models/cart/CommentReferences;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "nufgyqmvbu", "()Z", "isStockPacker", "iwizpuwonk", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommentReferences implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;
    public static final Parcelable.Creator<CommentReferences> CREATOR = new zoijcleaow();

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CommentReferences createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Reference.CREATOR.createFromParcel(parcel));
            }
            return new CommentReferences(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CommentReferences[] newArray(int i13) {
            return new CommentReferences[i13];
        }
    }

    public CommentReferences(String code, String title, List items) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.code = code;
        this.title = title;
        this.items = items;
    }

    public static /* synthetic */ CommentReferences ppxfxbqfkf(CommentReferences commentReferences, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commentReferences.code;
        }
        if ((i13 & 2) != 0) {
            str2 = commentReferences.title;
        }
        if ((i13 & 4) != 0) {
            list = commentReferences.items;
        }
        return commentReferences.zoijcleaow(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentReferences)) {
            return false;
        }
        CommentReferences commentReferences = (CommentReferences) other;
        return zdlpuopuiu.eablkybsjg(this.code, commentReferences.code) && zdlpuopuiu.eablkybsjg(this.title, commentReferences.title) && zdlpuopuiu.eablkybsjg(this.items, commentReferences.items);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.title.hashCode()) * 31) + this.items.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean nufgyqmvbu() {
        return zdlpuopuiu.eablkybsjg(this.code, "for_stock_packer");
    }

    public String toString() {
        return "CommentReferences(code=" + this.code + ", title=" + this.title + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.title);
        List list = this.items;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Reference) it.next()).writeToParcel(dest, flags);
        }
    }

    public final CommentReferences zoijcleaow(String code, String title, List items) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        return new CommentReferences(code, title, items);
    }
}
