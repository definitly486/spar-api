package xi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.czzsidtyhn;
import jh.xrmfcynszj;
import vi.sopmlzcsov;

/* JADX INFO: loaded from: classes3.dex */
public final class kegysxyocb extends mh.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final vi.rgvfuqvkyq f122485cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final iobyxmoadg f122486iozdgvuglv;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final di.kcexrzcfyt f122487yadqdtsiqt;

    /* JADX WARN: Illegal instructions before constructor call */
    public kegysxyocb(vi.rgvfuqvkyq c13, di.kcexrzcfyt proto, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        yi.agtfadlqog agtfadlqogVarNufgyqmvbu = c13.nufgyqmvbu();
        jh.wflxmlrfwp wflxmlrfwpVarEablkybsjg = c13.eablkybsjg();
        kh.nufgyqmvbu nufgyqmvbuVarZoijcleaow = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        ii.gxszxtbevo gxszxtbevoVarZoijcleaow = vi.jpowsppfya.zoijcleaow(c13.lqeggnwhkg(), proto.tzroggbefp());
        vi.dsvhmnatus dsvhmnatusVar = vi.dsvhmnatus.f116895iobyxmoadg;
        di.kcexrzcfyt.ppxfxbqfkf ppxfxbqfkfVarJlmebxxoox = proto.jlmebxxoox();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarJlmebxxoox, "getVariance(...)");
        super(agtfadlqogVarNufgyqmvbu, wflxmlrfwpVarEablkybsjg, nufgyqmvbuVarZoijcleaow, gxszxtbevoVarZoijcleaow, dsvhmnatusVar.wkgbmnqykc(ppxfxbqfkfVarJlmebxxoox), proto.mbcevpiqjq(), i13, xrmfcynszj.f51348iobyxmoadg, czzsidtyhn.iobyxmoadg.f51297iobyxmoadg);
        this.f122485cdpycssgdh = c13;
        this.f122487yadqdtsiqt = proto;
        this.f122486iozdgvuglv = new iobyxmoadg(c13.nufgyqmvbu(), new stevsuqkhv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List grlcpdaxtj(kegysxyocb kegysxyocbVar) {
        return hg.jyumaefscl.m(kegysxyocbVar.f122485cdpycssgdh.ppxfxbqfkf().wkgbmnqykc().gxszxtbevo(kegysxyocbVar.f122487yadqdtsiqt, kegysxyocbVar.f122485cdpycssgdh.lqeggnwhkg()));
    }

    @Override // mh.nufgyqmvbu
    protected List fyldjkxazc() {
        List listKcexrzcfyt = fi.gxszxtbevo.kcexrzcfyt(this.f122487yadqdtsiqt, this.f122485cdpycssgdh.btonecajqb());
        if (listKcexrzcfyt.isEmpty()) {
            return hg.jyumaefscl.eablkybsjg(pi.eablkybsjg.wflxmlrfwp(this).esjtqupxsv());
        }
        sopmlzcsov sopmlzcsovVarDxjokdxxww = this.f122485cdpycssgdh.dxjokdxxww();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listKcexrzcfyt, 10));
        Iterator it = listKcexrzcfyt.iterator();
        while (it.hasNext()) {
            arrayList.add(sopmlzcsovVarDxjokdxxww.yggfygwlhe((di.vdvldrhtss) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mh.nufgyqmvbu
    /* JADX INFO: renamed from: ixidwrxhsl, reason: merged with bridge method [inline-methods] */
    public Void ageimvtcrz(zi.kegysxyocb type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kh.zoijcleaow, kh.iobyxmoadg
    /* JADX INFO: renamed from: mhtqkkgtqm, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg getAnnotations() {
        return this.f122486iozdgvuglv;
    }
}
