package qj;

import android.os.Handler;
import android.os.Looper;
import gg.wwaezpbzkn;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.btonecajqb;
import pj.agtfadlqog;
import pj.dvvnrvtcbc;
import pj.grlcpdaxtj;
import pj.ikoacuggdj;
import pj.jztzpxfvev;
import pj.sopmlzcsov;
import tg.draadjrbmk;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends wkgbmnqykc implements sopmlzcsov {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ppxfxbqfkf f78929cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f78930iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f78931jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Handler f78932yggfygwlhe;

    public static final class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f78933yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f78934zdlpuopuiu;

        public iobyxmoadg(agtfadlqog agtfadlqogVar, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f78934zdlpuopuiu = agtfadlqogVar;
            this.f78933yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f78934zdlpuopuiu.cdpycssgdh(this.f78933yggfygwlhe, wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private ppxfxbqfkf(Handler handler, String str, boolean z13) {
        super(null);
        this.f78932yggfygwlhe = handler;
        this.f78931jyumaefscl = str;
        this.f78930iwizpuwonk = z13;
        this.f78929cqumvgiudr = z13 ? this : new ppxfxbqfkf(handler, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nuxfzjnpeb(ppxfxbqfkf ppxfxbqfkfVar, Runnable runnable, Throwable th2) {
        ppxfxbqfkfVar.f78932yggfygwlhe.removeCallbacks(runnable);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void opjhrmiecq(btonecajqb btonecajqbVar, Runnable runnable) {
        dvvnrvtcbc.ppxfxbqfkf(btonecajqbVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ikoacuggdj.zoijcleaow().dsvhmnatus(btonecajqbVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void weqkydbzbr(ppxfxbqfkf ppxfxbqfkfVar, Runnable runnable) {
        ppxfxbqfkfVar.f78932yggfygwlhe.removeCallbacks(runnable);
    }

    @Override // pj.sopmlzcsov
    public void cdpycssgdh(long j13, agtfadlqog agtfadlqogVar) {
        final iobyxmoadg iobyxmoadgVar = new iobyxmoadg(agtfadlqogVar, this);
        if (this.f78932yggfygwlhe.postDelayed(iobyxmoadgVar, gtknphoqwx.gtknphoqwx(j13, 4611686018427387903L))) {
            agtfadlqogVar.stevsuqkhv(new draadjrbmk() { // from class: qj.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ppxfxbqfkf.nuxfzjnpeb(this.f78928zdlpuopuiu, iobyxmoadgVar, (Throwable) obj);
                }
            });
        } else {
            opjhrmiecq(agtfadlqogVar.getContext(), iobyxmoadgVar);
        }
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(btonecajqb btonecajqbVar, Runnable runnable) {
        if (this.f78932yggfygwlhe.post(runnable)) {
            return;
        }
        opjhrmiecq(btonecajqbVar, runnable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ppxfxbqfkf) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar.f78932yggfygwlhe == this.f78932yggfygwlhe && ppxfxbqfkfVar.f78930iwizpuwonk == this.f78930iwizpuwonk) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f78932yggfygwlhe) ^ (this.f78930iwizpuwonk ? 1231 : 1237);
    }

    @Override // pj.sopmlzcsov
    public jztzpxfvev hkdspvbjdz(long j13, final Runnable runnable, btonecajqb btonecajqbVar) {
        if (this.f78932yggfygwlhe.postDelayed(runnable, gtknphoqwx.gtknphoqwx(j13, 4611686018427387903L))) {
            return new jztzpxfvev() { // from class: qj.zoijcleaow
                @Override // pj.jztzpxfvev
                public final void iobyxmoadg() {
                    ppxfxbqfkf.weqkydbzbr(this.f78936zdlpuopuiu, runnable);
                }
            };
        }
        opjhrmiecq(btonecajqbVar, runnable);
        return grlcpdaxtj.f76704zdlpuopuiu;
    }

    @Override // pj.ageimvtcrz
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ppxfxbqfkf xrmfcynszj() {
        return this.f78929cqumvgiudr;
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        String strRlfsiqarku = rlfsiqarku();
        if (strRlfsiqarku != null) {
            return strRlfsiqarku;
        }
        String string = this.f78931jyumaefscl;
        if (string == null) {
            string = this.f78932yggfygwlhe.toString();
        }
        if (!this.f78930iwizpuwonk) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // pj.pkzmftpjix
    public boolean ulzqkzuiru(btonecajqb btonecajqbVar) {
        return (this.f78930iwizpuwonk && zdlpuopuiu.eablkybsjg(Looper.myLooper(), this.f78932yggfygwlhe.getLooper())) ? false : true;
    }

    public /* synthetic */ ppxfxbqfkf(Handler handler, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(handler, (i13 & 2) != 0 ? null : str);
    }

    public ppxfxbqfkf(Handler handler, String str) {
        this(handler, str, false);
    }
}
