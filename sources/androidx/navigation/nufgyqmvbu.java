package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.rlfsiqarku;
import androidx.collection.xrmfcynszj;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu extends lqeggnwhkg implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final iobyxmoadg f12208pkzmftpjix = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final xrmfcynszj f12209iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f12210lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private String f12211wwaezpbzkn;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private String f12212ylkuphrtab;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.navigation.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0176iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0176iobyxmoadg f12213zdlpuopuiu = new C0176iobyxmoadg();

            C0176iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final lqeggnwhkg invoke(lqeggnwhkg it) {
                zdlpuopuiu.btonecajqb(it, "it");
                if (!(it instanceof nufgyqmvbu)) {
                    return null;
                }
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) it;
                return nufgyqmvbuVar.pmvmpeiblj(nufgyqmvbuVar.wwaezpbzkn());
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lj.btonecajqb iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
            zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
            return lj.wflxmlrfwp.agtfadlqog(nufgyqmvbuVar, C0176iobyxmoadg.f12213zdlpuopuiu);
        }

        public final lqeggnwhkg zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
            return (lqeggnwhkg) lj.wflxmlrfwp.cllcsxoeiz(iobyxmoadg(nufgyqmvbuVar));
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f12215yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f12216zdlpuopuiu = -1;

        zoijcleaow() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12216zdlpuopuiu + 1 < nufgyqmvbu.this.iozdgvuglv().ojitshcjhn();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f12215yggfygwlhe = true;
            xrmfcynszj xrmfcynszjVarIozdgvuglv = nufgyqmvbu.this.iozdgvuglv();
            int i13 = this.f12216zdlpuopuiu + 1;
            this.f12216zdlpuopuiu = i13;
            return (lqeggnwhkg) xrmfcynszjVarIozdgvuglv.rgvfuqvkyq(i13);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12215yggfygwlhe) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            xrmfcynszj xrmfcynszjVarIozdgvuglv = nufgyqmvbu.this.iozdgvuglv();
            ((lqeggnwhkg) xrmfcynszjVarIozdgvuglv.rgvfuqvkyq(this.f12216zdlpuopuiu)).iwizpuwonk(null);
            xrmfcynszjVarIozdgvuglv.wflxmlrfwp(this.f12216zdlpuopuiu);
            this.f12216zdlpuopuiu--;
            this.f12215yggfygwlhe = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(agtfadlqog navGraphNavigator) {
        super(navGraphNavigator);
        zdlpuopuiu.btonecajqb(navGraphNavigator, "navGraphNavigator");
        this.f12209iozdgvuglv = new xrmfcynszj(0, 1, null);
    }

    private final void hkdspvbjdz(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (zdlpuopuiu.eablkybsjg(str, agtfadlqog())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (kcexrzcfyt.zfvoamnweg(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = lqeggnwhkg.f12185cdpycssgdh.iobyxmoadg(str).hashCode();
        }
        this.f12210lmojexxdyd = iHashCode;
        this.f12212ylkuphrtab = str;
    }

    private final void jpowsppfya(int i13) {
        if (i13 != gtknphoqwx()) {
            if (this.f12212ylkuphrtab != null) {
                hkdspvbjdz(null);
            }
            this.f12210lmojexxdyd = i13;
            this.f12211wwaezpbzkn = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i13 + " cannot use the same id as the graph " + this).toString());
    }

    @Override // androidx.navigation.lqeggnwhkg
    public String btonecajqb() {
        return gtknphoqwx() != 0 ? super.btonecajqb() : "the root navigation";
    }

    public final lqeggnwhkg cdpycssgdh(int i13, lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) this.f12209iozdgvuglv.eablkybsjg(i13);
        if (lqeggnwhkgVar2 != null) {
            return lqeggnwhkgVar2;
        }
        if (z13) {
            Iterator it = lj.wflxmlrfwp.lqeggnwhkg(rlfsiqarku.zoijcleaow(this.f12209iozdgvuglv)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    lqeggnwhkgVar2 = null;
                    break;
                }
                lqeggnwhkg lqeggnwhkgVar3 = (lqeggnwhkg) it.next();
                lqeggnwhkg lqeggnwhkgVarCdpycssgdh = (!(lqeggnwhkgVar3 instanceof nufgyqmvbu) || zdlpuopuiu.eablkybsjg(lqeggnwhkgVar3, lqeggnwhkgVar)) ? null : ((nufgyqmvbu) lqeggnwhkgVar3).cdpycssgdh(i13, this, true);
                if (lqeggnwhkgVarCdpycssgdh != null) {
                    lqeggnwhkgVar2 = lqeggnwhkgVarCdpycssgdh;
                    break;
                }
            }
        }
        if (lqeggnwhkgVar2 != null) {
            return lqeggnwhkgVar2;
        }
        if (wflxmlrfwp() == null || zdlpuopuiu.eablkybsjg(wflxmlrfwp(), lqeggnwhkgVar)) {
            return null;
        }
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = wflxmlrfwp();
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVarWflxmlrfwp);
        return nufgyqmvbuVarWflxmlrfwp.cdpycssgdh(i13, this, z13);
    }

    @Override // androidx.navigation.lqeggnwhkg
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nufgyqmvbu)) {
            return false;
        }
        if (super.equals(obj)) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            if (this.f12209iozdgvuglv.ojitshcjhn() == nufgyqmvbuVar.f12209iozdgvuglv.ojitshcjhn() && wwaezpbzkn() == nufgyqmvbuVar.wwaezpbzkn()) {
                for (lqeggnwhkg lqeggnwhkgVar : lj.wflxmlrfwp.lqeggnwhkg(rlfsiqarku.zoijcleaow(this.f12209iozdgvuglv))) {
                    if (!zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, nufgyqmvbuVar.f12209iozdgvuglv.eablkybsjg(lqeggnwhkgVar.gtknphoqwx()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.lqeggnwhkg
    public int hashCode() {
        int iWwaezpbzkn = wwaezpbzkn();
        xrmfcynszj xrmfcynszjVar = this.f12209iozdgvuglv;
        int iOjitshcjhn = xrmfcynszjVar.ojitshcjhn();
        for (int i13 = 0; i13 < iOjitshcjhn; i13++) {
            iWwaezpbzkn = (((iWwaezpbzkn * 31) + xrmfcynszjVar.gtknphoqwx(i13)) * 31) + ((lqeggnwhkg) xrmfcynszjVar.rgvfuqvkyq(i13)).hashCode();
        }
        return iWwaezpbzkn;
    }

    public final lqeggnwhkg.zoijcleaow hcddaimhww(h5.lqeggnwhkg navDeepLinkRequest, boolean z13, boolean z14, lqeggnwhkg lastVisited) {
        lqeggnwhkg.zoijcleaow zoijcleaowVar;
        zdlpuopuiu.btonecajqb(navDeepLinkRequest, "navDeepLinkRequest");
        zdlpuopuiu.btonecajqb(lastVisited, "lastVisited");
        lqeggnwhkg.zoijcleaow zoijcleaowVarVdvldrhtss = super.vdvldrhtss(navDeepLinkRequest);
        lqeggnwhkg.zoijcleaow zoijcleaowVarHcddaimhww = null;
        if (z13) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) it.next();
                lqeggnwhkg.zoijcleaow zoijcleaowVarVdvldrhtss2 = !zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lastVisited) ? lqeggnwhkgVar.vdvldrhtss(navDeepLinkRequest) : null;
                if (zoijcleaowVarVdvldrhtss2 != null) {
                    arrayList.add(zoijcleaowVarVdvldrhtss2);
                }
            }
            zoijcleaowVar = (lqeggnwhkg.zoijcleaow) hg.jyumaefscl.hszhottldk(arrayList);
        } else {
            zoijcleaowVar = null;
        }
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = wflxmlrfwp();
        if (nufgyqmvbuVarWflxmlrfwp != null && z14 && !zdlpuopuiu.eablkybsjg(nufgyqmvbuVarWflxmlrfwp, lastVisited)) {
            zoijcleaowVarHcddaimhww = nufgyqmvbuVarWflxmlrfwp.hcddaimhww(navDeepLinkRequest, z13, true, this);
        }
        return (lqeggnwhkg.zoijcleaow) hg.jyumaefscl.hszhottldk(hg.jyumaefscl.oxmwwwfdhm(zoijcleaowVarVdvldrhtss, zoijcleaowVar, zoijcleaowVarHcddaimhww));
    }

    public final xrmfcynszj iozdgvuglv() {
        return this.f12209iozdgvuglv;
    }

    public final lqeggnwhkg istkbnxepw(String route, boolean z13) {
        Object next;
        lqeggnwhkg lqeggnwhkgVar;
        zdlpuopuiu.btonecajqb(route, "route");
        Iterator it = lj.wflxmlrfwp.lqeggnwhkg(rlfsiqarku.zoijcleaow(this.f12209iozdgvuglv)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            lqeggnwhkgVar = (lqeggnwhkg) next;
            if (kcexrzcfyt.cdpycssgdh(lqeggnwhkgVar.agtfadlqog(), route, false, 2, null)) {
                break;
            }
        } while (lqeggnwhkgVar.oxmwwwfdhm(route) == null);
        lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) next;
        if (lqeggnwhkgVar2 != null) {
            return lqeggnwhkgVar2;
        }
        if (!z13 || wflxmlrfwp() == null) {
            return null;
        }
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = wflxmlrfwp();
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVarWflxmlrfwp);
        return nufgyqmvbuVarWflxmlrfwp.zynmafqrjb(route);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zoijcleaow();
    }

    @Override // androidx.navigation.lqeggnwhkg
    public void kcexrzcfyt(Context context, AttributeSet attrs) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        super.kcexrzcfyt(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, i5.iobyxmoadg.NavGraphNavigator);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        jpowsppfya(typedArrayObtainAttributes.getResourceId(i5.iobyxmoadg.NavGraphNavigator_startDestination, 0));
        this.f12211wwaezpbzkn = lqeggnwhkg.f12185cdpycssgdh.zoijcleaow(context, this.f12210lmojexxdyd);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainAttributes.recycle();
    }

    public final void lereixgezr(lqeggnwhkg node) {
        zdlpuopuiu.btonecajqb(node, "node");
        int iGtknphoqwx = node.gtknphoqwx();
        String strAgtfadlqog = node.agtfadlqog();
        if (iGtknphoqwx == 0 && strAgtfadlqog == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (agtfadlqog() != null && zdlpuopuiu.eablkybsjg(strAgtfadlqog, agtfadlqog())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (iGtknphoqwx == gtknphoqwx()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f12209iozdgvuglv.eablkybsjg(iGtknphoqwx);
        if (lqeggnwhkgVar == node) {
            return;
        }
        if (node.wflxmlrfwp() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.iwizpuwonk(null);
        }
        node.iwizpuwonk(this);
        this.f12209iozdgvuglv.draadjrbmk(node.gtknphoqwx(), node);
    }

    public final String lmojexxdyd() {
        if (this.f12211wwaezpbzkn == null) {
            String strValueOf = this.f12212ylkuphrtab;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f12210lmojexxdyd);
            }
            this.f12211wwaezpbzkn = strValueOf;
        }
        String str = this.f12211wwaezpbzkn;
        zdlpuopuiu.lqeggnwhkg(str);
        return str;
    }

    public final lqeggnwhkg pmvmpeiblj(int i13) {
        return cdpycssgdh(i13, this, false);
    }

    @Override // androidx.navigation.lqeggnwhkg
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        lqeggnwhkg lqeggnwhkgVarZynmafqrjb = zynmafqrjb(this.f12212ylkuphrtab);
        if (lqeggnwhkgVarZynmafqrjb == null) {
            lqeggnwhkgVarZynmafqrjb = pmvmpeiblj(wwaezpbzkn());
        }
        sb3.append(" startDestination=");
        if (lqeggnwhkgVarZynmafqrjb == null) {
            String str = this.f12212ylkuphrtab;
            if (str != null) {
                sb3.append(str);
            } else {
                String str2 = this.f12211wwaezpbzkn;
                if (str2 != null) {
                    sb3.append(str2);
                } else {
                    sb3.append("0x" + Integer.toHexString(this.f12210lmojexxdyd));
                }
            }
        } else {
            sb3.append("{");
            sb3.append(lqeggnwhkgVarZynmafqrjb.toString());
            sb3.append("}");
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    @Override // androidx.navigation.lqeggnwhkg
    public lqeggnwhkg.zoijcleaow vdvldrhtss(h5.lqeggnwhkg navDeepLinkRequest) {
        zdlpuopuiu.btonecajqb(navDeepLinkRequest, "navDeepLinkRequest");
        return hcddaimhww(navDeepLinkRequest, true, false, this);
    }

    public final int wwaezpbzkn() {
        return this.f12210lmojexxdyd;
    }

    public final String ylkuphrtab() {
        return this.f12212ylkuphrtab;
    }

    public final lqeggnwhkg zynmafqrjb(String str) {
        if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
            return null;
        }
        return istkbnxepw(str, true);
    }
}
