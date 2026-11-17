package uj;

/* JADX INFO: loaded from: classes3.dex */
public class esjtqupxsv extends pj.iobyxmoadg implements kotlin.coroutines.jvm.internal.eablkybsjg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final lg.gxszxtbevo f113643iwizpuwonk;

    public esjtqupxsv(lg.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(btonecajqbVar, true, true);
        this.f113643iwizpuwonk = gxszxtbevoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public final kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        lg.gxszxtbevo gxszxtbevoVar = this.f113643iwizpuwonk;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // pj.lxfrhoxuzk
    protected final boolean iyctptxqzt() {
        return true;
    }

    @Override // pj.lxfrhoxuzk
    protected void yadqdtsiqt(Object obj) {
        nufgyqmvbu.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(this.f113643iwizpuwonk), pj.cdpycssgdh.iobyxmoadg(obj, this.f113643iwizpuwonk));
    }

    @Override // pj.iobyxmoadg
    protected void yzdjzghtvl(Object obj) {
        lg.gxszxtbevo gxszxtbevoVar = this.f113643iwizpuwonk;
        gxszxtbevoVar.resumeWith(pj.cdpycssgdh.iobyxmoadg(obj, gxszxtbevoVar));
    }
}
