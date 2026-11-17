package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp extends c9.iobyxmoadg implements Cloneable {

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    protected static final c9.gxszxtbevo f21171rlfsiqarku = (c9.gxszxtbevo) ((c9.gxszxtbevo) ((c9.gxszxtbevo) new c9.gxszxtbevo().gxszxtbevo(n8.iobyxmoadg.f69348ppxfxbqfkf)).jhduphickx(btonecajqb.LOW)).yfnezrywwk(true);

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final wkgbmnqykc f21172crxdokpmqz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private wflxmlrfwp f21173ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private wflxmlrfwp f21174jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private ojitshcjhn f21175jlmebxxoox;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private boolean f21176jztzpxfvev = true;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final Context f21177mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f21178metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final agtfadlqog f21179ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private Float f21180okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private Object f21181ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final zoijcleaow f21182sopmlzcsov;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final Class f21183ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private List f21184vipkmwdibw;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f21185xrmfcynszj;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f21186iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f21187zoijcleaow;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            f21187zoijcleaow = iArr;
            try {
                iArr[btonecajqb.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21187zoijcleaow[btonecajqb.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21187zoijcleaow[btonecajqb.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21187zoijcleaow[btonecajqb.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f21186iobyxmoadg = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21186iobyxmoadg[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected wflxmlrfwp(zoijcleaow zoijcleaowVar, agtfadlqog agtfadlqogVar, Class cls, Context context) {
        this.f21182sopmlzcsov = zoijcleaowVar;
        this.f21179ntlheqmsrt = agtfadlqogVar;
        this.f21183ulzqkzuiru = cls;
        this.f21177mbcevpiqjq = context;
        this.f21175jlmebxxoox = agtfadlqogVar.rgvfuqvkyq(cls);
        this.f21172crxdokpmqz = zoijcleaowVar.dxjokdxxww();
        dvvnrvtcbc(agtfadlqogVar.agtfadlqog());
        iobyxmoadg(agtfadlqogVar.ojitshcjhn());
    }

    private void dvvnrvtcbc(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iyctptxqzt((c9.eablkybsjg) it.next());
        }
    }

    private boolean hszhottldk(c9.iobyxmoadg iobyxmoadgVar, c9.ppxfxbqfkf ppxfxbqfkfVar) {
        return !iobyxmoadgVar.ylkuphrtab() && ppxfxbqfkfVar.iobyxmoadg();
    }

    private d9.dxjokdxxww igdgnonuha(d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, c9.iobyxmoadg iobyxmoadgVar, Executor executor) {
        g9.gtknphoqwx.eablkybsjg(dxjokdxxwwVar);
        if (!this.f21185xrmfcynszj) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        c9.ppxfxbqfkf ppxfxbqfkfVarZeieaojujs = zeieaojujs(dxjokdxxwwVar, eablkybsjgVar, iobyxmoadgVar, executor);
        c9.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        if (ppxfxbqfkfVarZeieaojujs.eablkybsjg(ppxfxbqfkfVarIobyxmoadg) && !hszhottldk(iobyxmoadgVar, ppxfxbqfkfVarIobyxmoadg)) {
            if (!((c9.ppxfxbqfkf) g9.gtknphoqwx.eablkybsjg(ppxfxbqfkfVarIobyxmoadg)).isRunning()) {
                ppxfxbqfkfVarIobyxmoadg.btonecajqb();
            }
            return dxjokdxxwwVar;
        }
        this.f21179ntlheqmsrt.draadjrbmk(dxjokdxxwwVar);
        dxjokdxxwwVar.zoijcleaow(ppxfxbqfkfVarZeieaojujs);
        this.f21179ntlheqmsrt.esjtqupxsv(dxjokdxxwwVar, ppxfxbqfkfVarZeieaojujs);
        return dxjokdxxwwVar;
    }

    private btonecajqb iwxlajgraz(btonecajqb btonecajqbVar) {
        int i13 = iobyxmoadg.f21187zoijcleaow[btonecajqbVar.ordinal()];
        if (i13 == 1) {
            return btonecajqb.NORMAL;
        }
        if (i13 == 2) {
            return btonecajqb.HIGH;
        }
        if (i13 == 3 || i13 == 4) {
            return btonecajqb.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + cqumvgiudr());
    }

    private wflxmlrfwp ixidwrxhsl(Uri uri, wflxmlrfwp wflxmlrfwpVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? wflxmlrfwpVar : lrnfpwlwnk(wflxmlrfwpVar);
    }

    private c9.ppxfxbqfkf jrbgnlbqoe(Object obj, d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, c9.iobyxmoadg iobyxmoadgVar, c9.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn ojitshcjhnVar, btonecajqb btonecajqbVar, int i13, int i14, Executor executor) {
        Context context = this.f21177mbcevpiqjq;
        wkgbmnqykc wkgbmnqykcVar2 = this.f21172crxdokpmqz;
        return c9.nufgyqmvbu.esjtqupxsv(context, wkgbmnqykcVar2, obj, this.f21181ribwqtqdhb, this.f21183ulzqkzuiru, iobyxmoadgVar, i13, i14, btonecajqbVar, dxjokdxxwwVar, eablkybsjgVar, this.f21184vipkmwdibw, wkgbmnqykcVar, wkgbmnqykcVar2.gxszxtbevo(), ojitshcjhnVar.zoijcleaow(), executor);
    }

    private wflxmlrfwp lrnfpwlwnk(wflxmlrfwp wflxmlrfwpVar) {
        return (wflxmlrfwp) ((wflxmlrfwp) wflxmlrfwpVar.ydmasvzmpa(this.f21177mbcevpiqjq.getTheme())).czzsidtyhn(f9.iobyxmoadg.ppxfxbqfkf(this.f21177mbcevpiqjq));
    }

    private wflxmlrfwp mhtqkkgtqm(Object obj) {
        if (iozdgvuglv()) {
            return clone().mhtqkkgtqm(obj);
        }
        this.f21181ribwqtqdhb = obj;
        this.f21185xrmfcynszj = true;
        return (wflxmlrfwp) metgxyhuhe();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private c9.ppxfxbqfkf nuxfzjnpeb(Object obj, d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, c9.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn ojitshcjhnVar, btonecajqb btonecajqbVar, int i13, int i14, c9.iobyxmoadg iobyxmoadgVar, Executor executor) {
        c9.wkgbmnqykc wkgbmnqykcVar2;
        c9.wkgbmnqykc zoijcleaowVar;
        if (this.f21173ikoacuggdj != null) {
            zoijcleaowVar = new c9.zoijcleaow(obj, wkgbmnqykcVar);
            wkgbmnqykcVar2 = zoijcleaowVar;
        } else {
            wkgbmnqykcVar2 = null;
            zoijcleaowVar = wkgbmnqykcVar;
        }
        c9.ppxfxbqfkf ppxfxbqfkfVarTbqsvytpvh = tbqsvytpvh(obj, dxjokdxxwwVar, eablkybsjgVar, zoijcleaowVar, ojitshcjhnVar, btonecajqbVar, i13, i14, iobyxmoadgVar, executor);
        if (wkgbmnqykcVar2 == null) {
            return ppxfxbqfkfVarTbqsvytpvh;
        }
        int iYggfygwlhe = this.f21173ikoacuggdj.yggfygwlhe();
        int iZdlpuopuiu = this.f21173ikoacuggdj.zdlpuopuiu();
        if (g9.draadjrbmk.zdlpuopuiu(i13, i14) && !this.f21173ikoacuggdj.stevsuqkhv()) {
            iYggfygwlhe = iobyxmoadgVar.yggfygwlhe();
            iZdlpuopuiu = iobyxmoadgVar.zdlpuopuiu();
        }
        wflxmlrfwp wflxmlrfwpVar = this.f21173ikoacuggdj;
        c9.zoijcleaow zoijcleaowVar2 = wkgbmnqykcVar2;
        zoijcleaowVar2.ojitshcjhn(ppxfxbqfkfVarTbqsvytpvh, wflxmlrfwpVar.nuxfzjnpeb(obj, dxjokdxxwwVar, eablkybsjgVar, zoijcleaowVar2, wflxmlrfwpVar.f21175jlmebxxoox, wflxmlrfwpVar.cqumvgiudr(), iYggfygwlhe, iZdlpuopuiu, this.f21173ikoacuggdj, executor));
        return zoijcleaowVar2;
    }

    private c9.ppxfxbqfkf tbqsvytpvh(Object obj, d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, c9.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn ojitshcjhnVar, btonecajqb btonecajqbVar, int i13, int i14, c9.iobyxmoadg iobyxmoadgVar, Executor executor) {
        wflxmlrfwp wflxmlrfwpVar = this.f21174jhduphickx;
        if (wflxmlrfwpVar == null) {
            if (this.f21180okpsazkaxt == null) {
                return jrbgnlbqoe(obj, dxjokdxxwwVar, eablkybsjgVar, iobyxmoadgVar, wkgbmnqykcVar, ojitshcjhnVar, btonecajqbVar, i13, i14, executor);
            }
            c9.dxjokdxxww dxjokdxxwwVar2 = new c9.dxjokdxxww(obj, wkgbmnqykcVar);
            dxjokdxxwwVar2.agtfadlqog(jrbgnlbqoe(obj, dxjokdxxwwVar, eablkybsjgVar, iobyxmoadgVar, dxjokdxxwwVar2, ojitshcjhnVar, btonecajqbVar, i13, i14, executor), jrbgnlbqoe(obj, dxjokdxxwwVar, eablkybsjgVar, iobyxmoadgVar.clone().uwvvkdfqfp(this.f21180okpsazkaxt.floatValue()), dxjokdxxwwVar2, ojitshcjhnVar, iwxlajgraz(btonecajqbVar), i13, i14, executor));
            return dxjokdxxwwVar2;
        }
        if (this.f21178metgxyhuhe) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        ojitshcjhn ojitshcjhnVar2 = wflxmlrfwpVar.f21176jztzpxfvev ? ojitshcjhnVar : wflxmlrfwpVar.f21175jlmebxxoox;
        btonecajqb btonecajqbVarCqumvgiudr = wflxmlrfwpVar.pkzmftpjix() ? this.f21174jhduphickx.cqumvgiudr() : iwxlajgraz(btonecajqbVar);
        int iYggfygwlhe = this.f21174jhduphickx.yggfygwlhe();
        int iZdlpuopuiu = this.f21174jhduphickx.zdlpuopuiu();
        if (g9.draadjrbmk.zdlpuopuiu(i13, i14) && !this.f21174jhduphickx.stevsuqkhv()) {
            iYggfygwlhe = iobyxmoadgVar.yggfygwlhe();
            iZdlpuopuiu = iobyxmoadgVar.zdlpuopuiu();
        }
        c9.dxjokdxxww dxjokdxxwwVar3 = new c9.dxjokdxxww(obj, wkgbmnqykcVar);
        c9.ppxfxbqfkf ppxfxbqfkfVarJrbgnlbqoe = jrbgnlbqoe(obj, dxjokdxxwwVar, eablkybsjgVar, iobyxmoadgVar, dxjokdxxwwVar3, ojitshcjhnVar, btonecajqbVar, i13, i14, executor);
        this.f21178metgxyhuhe = true;
        wflxmlrfwp wflxmlrfwpVar2 = this.f21174jhduphickx;
        c9.ppxfxbqfkf ppxfxbqfkfVarNuxfzjnpeb = wflxmlrfwpVar2.nuxfzjnpeb(obj, dxjokdxxwwVar, eablkybsjgVar, dxjokdxxwwVar3, ojitshcjhnVar2, btonecajqbVarCqumvgiudr, iYggfygwlhe, iZdlpuopuiu, wflxmlrfwpVar2, executor);
        this.f21178metgxyhuhe = false;
        dxjokdxxwwVar3.agtfadlqog(ppxfxbqfkfVarJrbgnlbqoe, ppxfxbqfkfVarNuxfzjnpeb);
        return dxjokdxxwwVar3;
    }

    private c9.ppxfxbqfkf zeieaojujs(d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, c9.iobyxmoadg iobyxmoadgVar, Executor executor) {
        return nuxfzjnpeb(new Object(), dxjokdxxwwVar, eablkybsjgVar, null, this.f21175jlmebxxoox, iobyxmoadgVar.cqumvgiudr(), iobyxmoadgVar.yggfygwlhe(), iobyxmoadgVar.zdlpuopuiu(), iobyxmoadgVar, executor);
    }

    public wflxmlrfwp ageimvtcrz(Uri uri) {
        return ixidwrxhsl(uri, mhtqkkgtqm(uri));
    }

    agtfadlqog auzgnhcxok() {
        return this.f21179ntlheqmsrt;
    }

    @Override // c9.iobyxmoadg
    public boolean equals(Object obj) {
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return super.equals(wflxmlrfwpVar) && Objects.equals(this.f21183ulzqkzuiru, wflxmlrfwpVar.f21183ulzqkzuiru) && this.f21175jlmebxxoox.equals(wflxmlrfwpVar.f21175jlmebxxoox) && Objects.equals(this.f21181ribwqtqdhb, wflxmlrfwpVar.f21181ribwqtqdhb) && Objects.equals(this.f21184vipkmwdibw, wflxmlrfwpVar.f21184vipkmwdibw) && Objects.equals(this.f21174jhduphickx, wflxmlrfwpVar.f21174jhduphickx) && Objects.equals(this.f21173ikoacuggdj, wflxmlrfwpVar.f21173ikoacuggdj) && Objects.equals(this.f21180okpsazkaxt, wflxmlrfwpVar.f21180okpsazkaxt) && this.f21176jztzpxfvev == wflxmlrfwpVar.f21176jztzpxfvev && this.f21185xrmfcynszj == wflxmlrfwpVar.f21185xrmfcynszj;
    }

    public wflxmlrfwp fiwbwshyhd(c9.eablkybsjg eablkybsjgVar) {
        if (iozdgvuglv()) {
            return clone().fiwbwshyhd(eablkybsjgVar);
        }
        this.f21184vipkmwdibw = null;
        return iyctptxqzt(eablkybsjgVar);
    }

    public wflxmlrfwp fmlbqenlif(ojitshcjhn ojitshcjhnVar) {
        if (iozdgvuglv()) {
            return clone().fmlbqenlif(ojitshcjhnVar);
        }
        this.f21175jlmebxxoox = (ojitshcjhn) g9.gtknphoqwx.eablkybsjg(ojitshcjhnVar);
        this.f21176jztzpxfvev = false;
        return (wflxmlrfwp) metgxyhuhe();
    }

    public wflxmlrfwp fyldjkxazc(Integer num) {
        return lrnfpwlwnk(mhtqkkgtqm(num));
    }

    public wflxmlrfwp grlcpdaxtj(String str) {
        return mhtqkkgtqm(str);
    }

    @Override // c9.iobyxmoadg
    public int hashCode() {
        return g9.draadjrbmk.rgvfuqvkyq(this.f21185xrmfcynszj, g9.draadjrbmk.rgvfuqvkyq(this.f21176jztzpxfvev, g9.draadjrbmk.ojitshcjhn(this.f21180okpsazkaxt, g9.draadjrbmk.ojitshcjhn(this.f21173ikoacuggdj, g9.draadjrbmk.ojitshcjhn(this.f21174jhduphickx, g9.draadjrbmk.ojitshcjhn(this.f21184vipkmwdibw, g9.draadjrbmk.ojitshcjhn(this.f21181ribwqtqdhb, g9.draadjrbmk.ojitshcjhn(this.f21175jlmebxxoox, g9.draadjrbmk.ojitshcjhn(this.f21183ulzqkzuiru, super.hashCode())))))))));
    }

    public wflxmlrfwp ipoelvxyzq(Object obj) {
        return mhtqkkgtqm(obj);
    }

    public wflxmlrfwp iyctptxqzt(c9.eablkybsjg eablkybsjgVar) {
        if (iozdgvuglv()) {
            return clone().iyctptxqzt(eablkybsjgVar);
        }
        if (eablkybsjgVar != null) {
            if (this.f21184vipkmwdibw == null) {
                this.f21184vipkmwdibw = new ArrayList();
            }
            this.f21184vipkmwdibw.add(eablkybsjgVar);
        }
        return (wflxmlrfwp) metgxyhuhe();
    }

    d9.dxjokdxxww lxfrhoxuzk(d9.dxjokdxxww dxjokdxxwwVar, c9.eablkybsjg eablkybsjgVar, Executor executor) {
        return igdgnonuha(dxjokdxxwwVar, eablkybsjgVar, this, executor);
    }

    @Override // c9.iobyxmoadg
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp clone() {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) super.clone();
        wflxmlrfwpVar.f21175jlmebxxoox = wflxmlrfwpVar.f21175jlmebxxoox.clone();
        if (wflxmlrfwpVar.f21184vipkmwdibw != null) {
            wflxmlrfwpVar.f21184vipkmwdibw = new ArrayList(wflxmlrfwpVar.f21184vipkmwdibw);
        }
        wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwpVar.f21174jhduphickx;
        if (wflxmlrfwpVar2 != null) {
            wflxmlrfwpVar.f21174jhduphickx = wflxmlrfwpVar2.clone();
        }
        wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwpVar.f21173ikoacuggdj;
        if (wflxmlrfwpVar3 != null) {
            wflxmlrfwpVar.f21173ikoacuggdj = wflxmlrfwpVar3.clone();
        }
        return wflxmlrfwpVar;
    }

    public d9.dxjokdxxww skhdrjzrfn(d9.dxjokdxxww dxjokdxxwwVar) {
        return lxfrhoxuzk(dxjokdxxwwVar, null, g9.eablkybsjg.zoijcleaow());
    }

    Object uawqvzlxes() {
        return this.f21181ribwqtqdhb;
    }

    @Override // c9.iobyxmoadg
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp iobyxmoadg(c9.iobyxmoadg iobyxmoadgVar) {
        g9.gtknphoqwx.eablkybsjg(iobyxmoadgVar);
        return (wflxmlrfwp) super.iobyxmoadg(iobyxmoadgVar);
    }

    public d9.btonecajqb wizcaqwiak(ImageView imageView) {
        c9.iobyxmoadg iobyxmoadgVarMbcevpiqjq;
        g9.draadjrbmk.iobyxmoadg();
        g9.gtknphoqwx.eablkybsjg(imageView);
        if (!wypolnanlu() && cllcsxoeiz() && imageView.getScaleType() != null) {
            switch (iobyxmoadg.f21186iobyxmoadg[imageView.getScaleType().ordinal()]) {
                case 1:
                    iobyxmoadgVarMbcevpiqjq = clone().mbcevpiqjq();
                    break;
                case 2:
                    iobyxmoadgVarMbcevpiqjq = clone().ntlheqmsrt();
                    break;
                case 3:
                case 4:
                case 5:
                    iobyxmoadgVarMbcevpiqjq = clone().ulzqkzuiru();
                    break;
                case 6:
                    iobyxmoadgVarMbcevpiqjq = clone().ntlheqmsrt();
                    break;
                default:
                    iobyxmoadgVarMbcevpiqjq = this;
                    break;
            }
        } else {
            iobyxmoadgVarMbcevpiqjq = this;
        }
        return (d9.btonecajqb) igdgnonuha(this.f21172crxdokpmqz.iobyxmoadg(imageView, this.f21183ulzqkzuiru), null, iobyxmoadgVarMbcevpiqjq, g9.eablkybsjg.zoijcleaow());
    }
}
