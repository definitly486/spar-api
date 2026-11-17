package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import h6.agtfadlqog;
import h6.draadjrbmk;
import h6.ojitshcjhn;
import h6.rgvfuqvkyq;
import h6.wflxmlrfwp;
import h6.wypolnanlu;
import h6.yggfygwlhe;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import n5.oxmwwwfdhm;
import n5.vdvldrhtss;
import p6.jyumaefscl;
import p6.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Ln5/oxmwwwfdhm;", "<init>", "()V", "Lp6/jyumaefscl;", "ulzqkzuiru", "()Lp6/jyumaefscl;", "Lp6/zoijcleaow;", "stevsuqkhv", "()Lp6/zoijcleaow;", "Lp6/zynmafqrjb;", "sopmlzcsov", "()Lp6/zynmafqrjb;", "Lp6/btonecajqb;", "tzroggbefp", "()Lp6/btonecajqb;", "Lp6/ojitshcjhn;", "mbcevpiqjq", "()Lp6/ojitshcjhn;", "Lp6/oxmwwwfdhm;", "ntlheqmsrt", "()Lp6/oxmwwwfdhm;", "Lp6/eablkybsjg;", "kegysxyocb", "()Lp6/eablkybsjg;", "rgvfuqvkyq", "iobyxmoadg", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkDatabase extends oxmwwwfdhm {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u5.nufgyqmvbu ppxfxbqfkf(Context context, u5.nufgyqmvbu.zoijcleaow configuration) {
            zdlpuopuiu.btonecajqb(configuration, "configuration");
            u5.nufgyqmvbu.zoijcleaow.iobyxmoadg iobyxmoadgVarIobyxmoadg = u5.nufgyqmvbu.zoijcleaow.f112692gxszxtbevo.iobyxmoadg(context);
            iobyxmoadgVarIobyxmoadg.wkgbmnqykc(configuration.f112697zoijcleaow).ppxfxbqfkf(configuration.f112695ppxfxbqfkf).eablkybsjg(true).iobyxmoadg(true);
            return new v5.gxszxtbevo().iobyxmoadg(iobyxmoadgVarIobyxmoadg.zoijcleaow());
        }

        public final WorkDatabase zoijcleaow(final Context context, Executor queryExecutor, g6.zoijcleaow clock, boolean z13) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(queryExecutor, "queryExecutor");
            zdlpuopuiu.btonecajqb(clock, "clock");
            return (WorkDatabase) (z13 ? vdvldrhtss.ppxfxbqfkf(context, WorkDatabase.class).ppxfxbqfkf() : vdvldrhtss.iobyxmoadg(context, WorkDatabase.class, "androidx.work.workdb").lqeggnwhkg(new u5.nufgyqmvbu.ppxfxbqfkf() { // from class: h6.lmojexxdyd
                @Override // u5.nufgyqmvbu.ppxfxbqfkf
                public final u5.nufgyqmvbu iobyxmoadg(u5.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
                    return WorkDatabase.Companion.ppxfxbqfkf(context, zoijcleaowVar);
                }
            })).nufgyqmvbu(queryExecutor).iobyxmoadg(new h6.wkgbmnqykc(clock)).zoijcleaow(h6.gtknphoqwx.f39550ppxfxbqfkf).zoijcleaow(new yggfygwlhe(context, 2, 3)).zoijcleaow(draadjrbmk.f39530ppxfxbqfkf).zoijcleaow(wflxmlrfwp.f39657ppxfxbqfkf).zoijcleaow(new yggfygwlhe(context, 5, 6)).zoijcleaow(agtfadlqog.f39515ppxfxbqfkf).zoijcleaow(ojitshcjhn.f39633ppxfxbqfkf).zoijcleaow(rgvfuqvkyq.f39640ppxfxbqfkf).zoijcleaow(new wypolnanlu(context)).zoijcleaow(new yggfygwlhe(context, 10, 11)).zoijcleaow(h6.lqeggnwhkg.f39586ppxfxbqfkf).zoijcleaow(h6.nufgyqmvbu.f39632ppxfxbqfkf).zoijcleaow(h6.dxjokdxxww.f39547ppxfxbqfkf).zoijcleaow(h6.btonecajqb.f39516ppxfxbqfkf).zoijcleaow(new yggfygwlhe(context, 21, 22)).eablkybsjg().wkgbmnqykc();
        }

        private Companion() {
        }
    }

    public abstract p6.eablkybsjg kegysxyocb();

    public abstract p6.ojitshcjhn mbcevpiqjq();

    public abstract p6.oxmwwwfdhm ntlheqmsrt();

    public abstract zynmafqrjb sopmlzcsov();

    public abstract p6.zoijcleaow stevsuqkhv();

    public abstract p6.btonecajqb tzroggbefp();

    public abstract jyumaefscl ulzqkzuiru();
}
