package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.fmlbqenlif;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import gg.wwaezpbzkn;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import yzdjzghtvl.cqumvgiudr;
import yzdjzghtvl.esjtqupxsv;
import yzdjzghtvl.lereixgezr;
import yzdjzghtvl.vdvldrhtss;
import yzdjzghtvl.yadqdtsiqt;
import yzdjzghtvl.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 R*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001SB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JR$\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006T"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lyzdjzghtvl/lereixgezr;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lgrlcpdaxtj/eablkybsjg;", "persistentList", "<init>", "(Lgrlcpdaxtj/eablkybsjg;)V", "()V", "Lyzdjzghtvl/zynmafqrjb;", "value", "Lgg/wwaezpbzkn;", "cllcsxoeiz", "(Lyzdjzghtvl/zynmafqrjb;)V", "", "oxmwwwfdhm", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "dxjokdxxww", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "btonecajqb", "(II)V", "start", "end", "wflxmlrfwp", "(Ljava/util/Collection;II)I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "Lyzdjzghtvl/zynmafqrjb;", "iozdgvuglv", "()Lyzdjzghtvl/zynmafqrjb;", "firstStateRecord", "gxszxtbevo", "size", "yggfygwlhe", "zoijcleaow", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateList<T> implements Parcelable, lereixgezr, List<T>, RandomAccess, ug.wkgbmnqykc {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private zynmafqrjb firstStateRecord;
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new iobyxmoadg();

    public static final class iobyxmoadg implements Parcelable.ClassLoaderCreator {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object wkgbmnqykc(Parcel parcel, ClassLoader classLoader, int i13) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList[] newArray(int i13) {
            return new SnapshotStateList[i13];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = iobyxmoadg.class.getClassLoader();
            }
            return vdvldrhtss.iobyxmoadg(parcel.readInt(), new tg.draadjrbmk() { // from class: yzdjzghtvl.rgvfuqvkyq
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return SnapshotStateList.iobyxmoadg.wkgbmnqykc(parcel, classLoader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }
    }

    public SnapshotStateList(grlcpdaxtj.eablkybsjg eablkybsjgVar) {
        this.firstStateRecord = vdvldrhtss.draadjrbmk(this, eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(int i13, Collection collection, List list) {
        return list.addAll(i13, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gtknphoqwx(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object element) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarAdd = eablkybsjgVarDxjokdxxww.add(element);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarAdd, eablkybsjgVarDxjokdxxww)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarAdd, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection elements) {
        return vdvldrhtss.gtknphoqwx(this, new tg.draadjrbmk() { // from class: yzdjzghtvl.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.eablkybsjg(index, elements, (List) obj));
            }
        });
    }

    public final void btonecajqb(int fromIndex, int toIndex) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = eablkybsjgVarDxjokdxxww.nufgyqmvbu();
            iobyxmoadgVarNufgyqmvbu.subList(fromIndex, toIndex).clear();
            grlcpdaxtj.eablkybsjg eablkybsjgVarBuild = iobyxmoadgVarNufgyqmvbu.build();
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarBuild, eablkybsjgVarDxjokdxxww)) {
                return;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarBuild, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        zynmafqrjb firstStateRecord = getFirstStateRecord();
        zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) firstStateRecord;
        synchronized (btonecajqb.dsvhmnatus()) {
            lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar, this, lqeggnwhkgVarPpxfxbqfkf);
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                esjtqupxsvVar2.draadjrbmk(grlcpdaxtj.iobyxmoadg.iobyxmoadg());
                esjtqupxsvVar2.wflxmlrfwp(esjtqupxsvVar2.btonecajqb() + 1);
                esjtqupxsvVar2.agtfadlqog(esjtqupxsvVar2.gtknphoqwx() + 1);
            }
        }
        btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(zynmafqrjb value) {
        value.lqeggnwhkg(getFirstStateRecord());
        zdlpuopuiu.nufgyqmvbu(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (esjtqupxsv) value;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object dxjokdxxww(int index) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        Object obj = get(index);
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarJlmebxxoox = eablkybsjgVarDxjokdxxww.jlmebxxoox(index);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarJlmebxxoox, eablkybsjgVarDxjokdxxww)) {
                break;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarJlmebxxoox, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return obj;
    }

    @Override // java.util.List
    public Object get(int index) {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().get(index);
    }

    public int gxszxtbevo() {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().indexOf(element);
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public zynmafqrjb getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new cqumvgiudr(this, 0);
    }

    public final List oxmwwwfdhm() {
        return vdvldrhtss.lqeggnwhkg(this).dxjokdxxww();
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i13) {
        return dxjokdxxww(i13);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection elements) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarRemoveAll = eablkybsjgVarDxjokdxxww.removeAll(elements);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarRemoveAll, eablkybsjgVarDxjokdxxww)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarRemoveAll, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return vdvldrhtss.gtknphoqwx(this, new tg.draadjrbmk() { // from class: yzdjzghtvl.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.gtknphoqwx(elements, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public Object set(int index, Object element) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        Object obj = get(index);
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVar = eablkybsjgVarDxjokdxxww.set(index, element);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjgVarDxjokdxxww)) {
                break;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVar, false);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return gxszxtbevo();
    }

    @Override // java.util.List
    public List subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            fmlbqenlif.iobyxmoadg("fromIndex or toIndex are out of bounds");
        }
        return new yadqdtsiqt(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        zynmafqrjb firstStateRecord = getFirstStateRecord();
        zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord)).dxjokdxxww() + ")@" + hashCode();
    }

    public final int wflxmlrfwp(Collection elements, int start, int end) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        int size = size();
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = eablkybsjgVarDxjokdxxww.nufgyqmvbu();
            iobyxmoadgVarNufgyqmvbu.subList(start, end).retainAll(elements);
            grlcpdaxtj.eablkybsjg eablkybsjgVarBuild = iobyxmoadgVarNufgyqmvbu.build();
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarBuild, eablkybsjgVarDxjokdxxww)) {
                break;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarBuild, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return size - size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List listOxmwwwfdhm = oxmwwwfdhm();
        int size = listOxmwwwfdhm.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeValue(listOxmwwwfdhm.get(i13));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection elements) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarAddAll = eablkybsjgVarDxjokdxxww.addAll(elements);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarAddAll, eablkybsjgVarDxjokdxxww)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarAddAll, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int index) {
        return new cqumvgiudr(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarRemove = eablkybsjgVarDxjokdxxww.remove(element);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarRemove, eablkybsjgVarDxjokdxxww)) {
                return false;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarRemove, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
    }

    public SnapshotStateList() {
        this(grlcpdaxtj.iobyxmoadg.iobyxmoadg());
    }

    @Override // java.util.List
    public void add(int index, Object element) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (vdvldrhtss.f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = getFirstStateRecord();
                zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg eablkybsjgVarAdd = eablkybsjgVarDxjokdxxww.add(index, element);
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarAdd, eablkybsjgVarDxjokdxxww)) {
                return;
            }
            zynmafqrjb firstStateRecord2 = getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = vdvldrhtss.gxszxtbevo((esjtqupxsv) btonecajqb.bfopjjpdmp(esjtqupxsvVar2, this, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarAdd, true);
            }
            btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        } while (!zGxszxtbevo);
    }
}
