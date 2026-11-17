package h5;

import android.os.Bundle;
import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wypolnanlu f39427eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wypolnanlu f39428gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ReentrantLock f39429iobyxmoadg = new ReentrantLock(true);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f39430ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f39431wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f39432zoijcleaow;

    public wflxmlrfwp() {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(jyumaefscl.wflxmlrfwp());
        this.f39432zoijcleaow = zynmafqrjbVarIobyxmoadg;
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(ikoacuggdj.eablkybsjg());
        this.f39430ppxfxbqfkf = zynmafqrjbVarIobyxmoadg2;
        this.f39427eablkybsjg = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        this.f39428gxszxtbevo = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
    }

    public void btonecajqb(androidx.navigation.ppxfxbqfkf entry) {
        zdlpuopuiu.btonecajqb(entry, "entry");
        zynmafqrjb zynmafqrjbVar = this.f39430ppxfxbqfkf;
        zynmafqrjbVar.setValue(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar.getValue(), entry));
    }

    public void draadjrbmk(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.f39430ppxfxbqfkf.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((androidx.navigation.ppxfxbqfkf) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.f39427eablkybsjg.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((androidx.navigation.ppxfxbqfkf) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) jyumaefscl.lxfrhoxuzk((List) this.f39427eablkybsjg.getValue());
        if (ppxfxbqfkfVar != null) {
            zynmafqrjb zynmafqrjbVar = this.f39430ppxfxbqfkf;
            zynmafqrjbVar.setValue(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar.getValue(), ppxfxbqfkfVar));
        }
        zynmafqrjb zynmafqrjbVar2 = this.f39430ppxfxbqfkf;
        zynmafqrjbVar2.setValue(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar2.getValue(), backStackEntry));
        gtknphoqwx(backStackEntry);
    }

    public void dxjokdxxww(androidx.navigation.ppxfxbqfkf popUpTo, boolean z13) {
        Object objPrevious;
        zdlpuopuiu.btonecajqb(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this.f39430ppxfxbqfkf.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((androidx.navigation.ppxfxbqfkf) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.f39427eablkybsjg.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((androidx.navigation.ppxfxbqfkf) it2.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        zynmafqrjb zynmafqrjbVar = this.f39430ppxfxbqfkf;
        zynmafqrjbVar.setValue(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar.getValue(), popUpTo));
        List list = (List) this.f39427eablkybsjg.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) objPrevious;
            if (!zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, popUpTo) && ((List) this.f39427eablkybsjg.getValue()).lastIndexOf(ppxfxbqfkfVar) < ((List) this.f39427eablkybsjg.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar2 = (androidx.navigation.ppxfxbqfkf) objPrevious;
        if (ppxfxbqfkfVar2 != null) {
            zynmafqrjb zynmafqrjbVar2 = this.f39430ppxfxbqfkf;
            zynmafqrjbVar2.setValue(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar2.getValue(), ppxfxbqfkfVar2));
        }
        nufgyqmvbu(popUpTo, z13);
    }

    public void eablkybsjg(androidx.navigation.ppxfxbqfkf entry) {
        zdlpuopuiu.btonecajqb(entry, "entry");
        zynmafqrjb zynmafqrjbVar = this.f39430ppxfxbqfkf;
        zynmafqrjbVar.setValue(ikoacuggdj.gtknphoqwx((Set) zynmafqrjbVar.getValue(), entry));
    }

    public void gtknphoqwx(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f39429iobyxmoadg;
        reentrantLock.lock();
        try {
            zynmafqrjb zynmafqrjbVar = this.f39432zoijcleaow;
            zynmafqrjbVar.setValue(jyumaefscl.jrbgnlbqoe((Collection) zynmafqrjbVar.getValue(), backStackEntry));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void gxszxtbevo(androidx.navigation.ppxfxbqfkf backStackEntry) {
        int iNextIndex;
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f39429iobyxmoadg;
        reentrantLock.lock();
        try {
            List listP = jyumaefscl.p((Collection) this.f39427eablkybsjg.getValue());
            ListIterator listIterator = listP.listIterator(listP.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) listIterator.previous()).gxszxtbevo(), backStackEntry.gxszxtbevo())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listP.set(iNextIndex, backStackEntry);
            this.f39432zoijcleaow.setValue(listP);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract androidx.navigation.ppxfxbqfkf iobyxmoadg(androidx.navigation.lqeggnwhkg lqeggnwhkgVar, Bundle bundle);

    public void lqeggnwhkg(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        List list = (List) this.f39427eablkybsjg.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) listIterator.previous();
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.gxszxtbevo(), backStackEntry.gxszxtbevo())) {
                zynmafqrjb zynmafqrjbVar = this.f39430ppxfxbqfkf;
                zynmafqrjbVar.setValue(ikoacuggdj.wflxmlrfwp(ikoacuggdj.wflxmlrfwp((Set) zynmafqrjbVar.getValue(), ppxfxbqfkfVar), backStackEntry));
                gxszxtbevo(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void nufgyqmvbu(androidx.navigation.ppxfxbqfkf popUpTo, boolean z13) {
        zdlpuopuiu.btonecajqb(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f39429iobyxmoadg;
        reentrantLock.lock();
        try {
            zynmafqrjb zynmafqrjbVar = this.f39432zoijcleaow;
            Iterable iterable = (Iterable) zynmafqrjbVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (zdlpuopuiu.eablkybsjg((androidx.navigation.ppxfxbqfkf) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            zynmafqrjbVar.setValue(arrayList);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final wypolnanlu ppxfxbqfkf() {
        return this.f39428gxszxtbevo;
    }

    public final void wflxmlrfwp(boolean z13) {
        this.f39431wkgbmnqykc = z13;
    }

    public final boolean wkgbmnqykc() {
        return this.f39431wkgbmnqykc;
    }

    public final wypolnanlu zoijcleaow() {
        return this.f39427eablkybsjg;
    }
}
