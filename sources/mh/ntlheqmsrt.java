package mh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.iyctptxqzt;
import jh.xrmfcynszj;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public class ntlheqmsrt extends sopmlzcsov implements iyctptxqzt {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final iobyxmoadg f67119yadqdtsiqt = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final iyctptxqzt f67120cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f67121esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final zi.kegysxyocb f67122istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f67123lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f67124pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final boolean f67125zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ntlheqmsrt iobyxmoadg(jh.iobyxmoadg containingDeclaration, iyctptxqzt iyctptxqztVar, int i13, kh.nufgyqmvbu annotations, ii.gxszxtbevo name, zi.kegysxyocb outType, boolean z13, boolean z14, boolean z15, zi.kegysxyocb kegysxyocbVar, xrmfcynszj source, tg.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outType, "outType");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            return iobyxmoadgVar == null ? new ntlheqmsrt(containingDeclaration, iyctptxqztVar, i13, annotations, name, outType, z13, z14, z15, kegysxyocbVar, source) : new zoijcleaow(containingDeclaration, iyctptxqztVar, i13, annotations, name, outType, z13, z14, z15, kegysxyocbVar, source, iobyxmoadgVar);
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow extends ntlheqmsrt {

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final gg.gtknphoqwx f67126iozdgvuglv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(jh.iobyxmoadg containingDeclaration, iyctptxqzt iyctptxqztVar, int i13, kh.nufgyqmvbu annotations, ii.gxszxtbevo name, zi.kegysxyocb outType, boolean z13, boolean z14, boolean z15, zi.kegysxyocb kegysxyocbVar, xrmfcynszj source, tg.iobyxmoadg destructuringVariables) {
            super(containingDeclaration, iyctptxqztVar, i13, annotations, name, outType, z13, z14, z15, kegysxyocbVar, source);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outType, "outType");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destructuringVariables, "destructuringVariables");
            this.f67126iozdgvuglv = gg.draadjrbmk.zoijcleaow(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List mhtqkkgtqm(zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.ixidwrxhsl();
        }

        public final List ixidwrxhsl() {
            return (List) this.f67126iozdgvuglv.getValue();
        }

        @Override // mh.ntlheqmsrt, jh.iyctptxqzt
        public iyctptxqzt stevsuqkhv(jh.iobyxmoadg newOwner, ii.gxszxtbevo newName, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newOwner, "newOwner");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newName, "newName");
            kh.nufgyqmvbu annotations = getAnnotations();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(annotations, "<get-annotations>(...)");
            zi.kegysxyocb type = getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            boolean zAuzgnhcxok = auzgnhcxok();
            boolean zZfvoamnweg = zfvoamnweg();
            boolean zSflfametgt = sflfametgt();
            zi.kegysxyocb kegysxyocbVarIyctptxqzt = iyctptxqzt();
            xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
            return new zoijcleaow(newOwner, null, i13, annotations, newName, type, zAuzgnhcxok, zZfvoamnweg, zSflfametgt, kegysxyocbVarIyctptxqzt, NO_SOURCE, new ulzqkzuiru(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntlheqmsrt(jh.iobyxmoadg containingDeclaration, iyctptxqzt iyctptxqztVar, int i13, kh.nufgyqmvbu annotations, ii.gxszxtbevo name, zi.kegysxyocb outType, boolean z13, boolean z14, boolean z15, zi.kegysxyocb kegysxyocbVar, xrmfcynszj source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outType, "outType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        this.f67121esjtqupxsv = i13;
        this.f67123lereixgezr = z13;
        this.f67124pmvmpeiblj = z14;
        this.f67125zynmafqrjb = z15;
        this.f67122istkbnxepw = kegysxyocbVar;
        this.f67120cdpycssgdh = iyctptxqztVar == null ? this : iyctptxqztVar;
    }

    public static final ntlheqmsrt ageimvtcrz(jh.iobyxmoadg iobyxmoadgVar, iyctptxqzt iyctptxqztVar, int i13, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, zi.kegysxyocb kegysxyocbVar, boolean z13, boolean z14, boolean z15, zi.kegysxyocb kegysxyocbVar2, xrmfcynszj xrmfcynszjVar, tg.iobyxmoadg iobyxmoadgVar2) {
        return f67119yadqdtsiqt.iobyxmoadg(iobyxmoadgVar, iyctptxqztVar, i13, nufgyqmvbuVar, gxszxtbevoVar, kegysxyocbVar, z13, z14, z15, kegysxyocbVar2, xrmfcynszjVar, iobyxmoadgVar2);
    }

    @Override // jh.iyctptxqzt
    public boolean auzgnhcxok() {
        if (this.f67123lereixgezr) {
            jh.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((jh.zoijcleaow) iobyxmoadgVarZoijcleaow).getKind().iobyxmoadg()) {
                return true;
            }
        }
        return false;
    }

    @Override // jh.iobyxmoadg
    public Collection eablkybsjg() {
        Collection collectionEablkybsjg = zoijcleaow().eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
        Collection collection = collectionEablkybsjg;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((iyctptxqzt) ((jh.iobyxmoadg) it.next()).dxjokdxxww().get(getIndex()));
        }
        return arrayList;
    }

    public Void fyldjkxazc() {
        return null;
    }

    @Override // jh.iyctptxqzt
    public int getIndex() {
        return this.f67121esjtqupxsv;
    }

    @Override // jh.vdvldrhtss, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe LOCAL = jh.zdlpuopuiu.f51356gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // jh.rlfsiqarku
    /* JADX INFO: renamed from: ipoelvxyzq, reason: merged with bridge method [inline-methods] */
    public iyctptxqzt ppxfxbqfkf(wizcaqwiak substitutor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(substitutor, "substitutor");
        if (substitutor.gtknphoqwx()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // jh.iyctptxqzt
    public zi.kegysxyocb iyctptxqzt() {
        return this.f67122istkbnxepw;
    }

    @Override // jh.weqkydbzbr
    public boolean jpowsppfya() {
        return false;
    }

    @Override // jh.iyctptxqzt
    public boolean sflfametgt() {
        return this.f67125zynmafqrjb;
    }

    @Override // jh.iyctptxqzt
    public iyctptxqzt stevsuqkhv(jh.iobyxmoadg newOwner, ii.gxszxtbevo newName, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newOwner, "newOwner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newName, "newName");
        kh.nufgyqmvbu annotations = getAnnotations();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(annotations, "<get-annotations>(...)");
        zi.kegysxyocb type = getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        boolean zAuzgnhcxok = auzgnhcxok();
        boolean zZfvoamnweg = zfvoamnweg();
        boolean zSflfametgt = sflfametgt();
        zi.kegysxyocb kegysxyocbVarIyctptxqzt = iyctptxqzt();
        xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
        return new ntlheqmsrt(newOwner, null, i13, annotations, newName, type, zAuzgnhcxok, zZfvoamnweg, zSflfametgt, kegysxyocbVarIyctptxqzt, NO_SOURCE);
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn visitor, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visitor, "visitor");
        return visitor.zoijcleaow(this, obj);
    }

    @Override // jh.weqkydbzbr
    public /* bridge */ /* synthetic */ ni.lqeggnwhkg ydmasvzmpa() {
        return (ni.lqeggnwhkg) fyldjkxazc();
    }

    @Override // jh.iyctptxqzt
    public boolean zfvoamnweg() {
        return this.f67124pmvmpeiblj;
    }

    @Override // mh.agtfadlqog, jh.wflxmlrfwp
    public jh.iobyxmoadg zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = super.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (jh.iobyxmoadg) wflxmlrfwpVarZoijcleaow;
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    public iyctptxqzt iobyxmoadg() {
        iyctptxqzt iyctptxqztVar = this.f67120cdpycssgdh;
        return iyctptxqztVar == this ? this : iyctptxqztVar.iobyxmoadg();
    }
}
