package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import yzdjzghtvl.cdpycssgdh;
import yzdjzghtvl.istkbnxepw;
import yzdjzghtvl.lereixgezr;
import yzdjzghtvl.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u00017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0014J\u001d\u0010\"\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010%\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u001d\u0010&\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R$\u00103\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Lyzdjzghtvl/lereixgezr;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Lyzdjzghtvl/zynmafqrjb;", "value", "Lgg/wwaezpbzkn;", "cllcsxoeiz", "(Lyzdjzghtvl/zynmafqrjb;)V", "", "gxszxtbevo", "()Ljava/util/Set;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "add", "addAll", "clear", "remove", "removeAll", "retainAll", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "Lyzdjzghtvl/zynmafqrjb;", "iozdgvuglv", "()Lyzdjzghtvl/zynmafqrjb;", "firstStateRecord", "ppxfxbqfkf", "size", "yggfygwlhe", "zoijcleaow", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateSet<T> implements Parcelable, lereixgezr, Set<T>, RandomAccess, ug.gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private zynmafqrjb firstStateRecord = draadjrbmk.gxszxtbevo(this, grlcpdaxtj.iobyxmoadg.zoijcleaow());
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new iobyxmoadg();

    public static final class iobyxmoadg implements Parcelable.ClassLoaderCreator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet[] newArray(int i13) {
            return new SnapshotStateSet[i13];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int i13 = parcel.readInt();
            for (int i14 = 0; i14 < i13; i14++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(Collection collection, Set set) {
        return set.retainAll(jyumaefscl.r(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object element) {
        int iDxjokdxxww;
        grlcpdaxtj.gxszxtbevo gxszxtbevoVarBtonecajqb;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zZoijcleaow;
        do {
            synchronized (draadjrbmk.f5966iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) firstStateRecord);
                iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
                gxszxtbevoVarBtonecajqb = cdpycssgdhVar.btonecajqb();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarBtonecajqb);
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarAdd = gxszxtbevoVarBtonecajqb.add(element);
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarAdd, gxszxtbevoVarBtonecajqb)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zZoijcleaow = draadjrbmk.zoijcleaow((cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar2, this, lqeggnwhkgVarPpxfxbqfkf), iDxjokdxxww, gxszxtbevoVarAdd);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zZoijcleaow);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        int iDxjokdxxww;
        grlcpdaxtj.gxszxtbevo gxszxtbevoVarBtonecajqb;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zZoijcleaow;
        do {
            synchronized (draadjrbmk.f5966iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) firstStateRecord);
                iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
                gxszxtbevoVarBtonecajqb = cdpycssgdhVar.btonecajqb();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarBtonecajqb);
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarAddAll = gxszxtbevoVarBtonecajqb.addAll(elements);
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarAddAll, gxszxtbevoVarBtonecajqb)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zZoijcleaow = draadjrbmk.zoijcleaow((cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar2, this, lqeggnwhkgVarPpxfxbqfkf), iDxjokdxxww, gxszxtbevoVarAddAll);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zZoijcleaow);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        zynmafqrjb firstStateRecord = getFirstStateRecord();
        zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) firstStateRecord;
        synchronized (btonecajqb.dsvhmnatus()) {
            lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar, this, lqeggnwhkgVarPpxfxbqfkf);
            synchronized (draadjrbmk.f5966iobyxmoadg) {
                cdpycssgdhVar2.draadjrbmk(grlcpdaxtj.iobyxmoadg.zoijcleaow());
                cdpycssgdhVar2.gtknphoqwx(cdpycssgdhVar2.dxjokdxxww() + 1);
            }
        }
        btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(zynmafqrjb value) {
        value.lqeggnwhkg(getFirstStateRecord());
        zdlpuopuiu.nufgyqmvbu(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (cdpycssgdh) value;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return draadjrbmk.wkgbmnqykc(this).btonecajqb().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        return draadjrbmk.wkgbmnqykc(this).btonecajqb().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set gxszxtbevo() {
        return draadjrbmk.wkgbmnqykc(this).btonecajqb();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public zynmafqrjb getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return draadjrbmk.wkgbmnqykc(this).btonecajqb().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new istkbnxepw(this, draadjrbmk.wkgbmnqykc(this).btonecajqb().iterator());
    }

    public int ppxfxbqfkf() {
        return draadjrbmk.wkgbmnqykc(this).btonecajqb().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int iDxjokdxxww;
        grlcpdaxtj.gxszxtbevo gxszxtbevoVarBtonecajqb;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zZoijcleaow;
        do {
            synchronized (draadjrbmk.f5966iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) firstStateRecord);
                iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
                gxszxtbevoVarBtonecajqb = cdpycssgdhVar.btonecajqb();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarBtonecajqb);
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarRemove = gxszxtbevoVarBtonecajqb.remove(element);
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarRemove, gxszxtbevoVarBtonecajqb)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zZoijcleaow = draadjrbmk.zoijcleaow((cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar2, this, lqeggnwhkgVarPpxfxbqfkf), iDxjokdxxww, gxszxtbevoVarRemove);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zZoijcleaow);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        int iDxjokdxxww;
        grlcpdaxtj.gxszxtbevo gxszxtbevoVarBtonecajqb;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zZoijcleaow;
        do {
            synchronized (draadjrbmk.f5966iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) firstStateRecord);
                iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
                gxszxtbevoVarBtonecajqb = cdpycssgdhVar.btonecajqb();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarBtonecajqb);
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarRemoveAll = gxszxtbevoVarBtonecajqb.removeAll(elements);
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarRemoveAll, gxszxtbevoVarBtonecajqb)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zZoijcleaow = draadjrbmk.zoijcleaow((cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar2, this, lqeggnwhkgVarPpxfxbqfkf), iDxjokdxxww, gxszxtbevoVarRemoveAll);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zZoijcleaow);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return draadjrbmk.eablkybsjg(this, new tg.draadjrbmk() { // from class: yzdjzghtvl.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateSet.eablkybsjg(elements, (Set) obj));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return ppxfxbqfkf();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        zynmafqrjb firstStateRecord = getFirstStateRecord();
        zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) firstStateRecord)).btonecajqb() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Set setGxszxtbevo = gxszxtbevo();
        parcel.writeInt(size());
        Iterator it = setGxszxtbevo.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
    }
}
