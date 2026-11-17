package ru.myspar.orders.impl.screens.specific.presentation;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import hu.esjtqupxsv;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f91347cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f91348esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f91349iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ee0.ppxfxbqfkf f91350jyumaefscl;

    public static final class agtfadlqog implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91351jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91352yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91353zdlpuopuiu;

        public agtfadlqog(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91353zdlpuopuiu = jpowsppfyaVar;
            this.f91352yggfygwlhe = j13;
            this.f91351jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91353zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91352yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91351jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.kcexrzcfyt.f91435iobyxmoadg);
        }
    }

    public static final class btonecajqb implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91354jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91355yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91356zdlpuopuiu;

        public btonecajqb(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91356zdlpuopuiu = jpowsppfyaVar;
            this.f91355yggfygwlhe = j13;
            this.f91354jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91356zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91355yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91354jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.vdvldrhtss.f91443iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91357jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91358yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91359zdlpuopuiu;

        public draadjrbmk(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91359zdlpuopuiu = jpowsppfyaVar;
            this.f91358yggfygwlhe = j13;
            this.f91357jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91359zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91358yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91357jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.rgvfuqvkyq.f91442iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91360jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91361yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91362zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91362zdlpuopuiu = jpowsppfyaVar;
            this.f91361yggfygwlhe = j13;
            this.f91360jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91362zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91361yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91360jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.jyumaefscl.f91434iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC2120eablkybsjg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91363jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91364yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91365zdlpuopuiu;

        public ViewOnClickListenerC2120eablkybsjg(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91365zdlpuopuiu = jpowsppfyaVar;
            this.f91364yggfygwlhe = j13;
            this.f91363jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91365zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91364yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91363jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.gxszxtbevo.f91430iobyxmoadg);
        }
    }

    public static final class gtknphoqwx implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91366jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91367yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91368zdlpuopuiu;

        public gtknphoqwx(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91368zdlpuopuiu = jpowsppfyaVar;
            this.f91367yggfygwlhe = j13;
            this.f91366jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91368zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91367yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91366jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.C2122ppxfxbqfkf.f91441iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91369jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91370yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91371zdlpuopuiu;

        public gxszxtbevo(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91371zdlpuopuiu = jpowsppfyaVar;
            this.f91370yggfygwlhe = j13;
            this.f91369jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91371zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91370yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91369jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.cqumvgiudr.f91424iobyxmoadg);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class lqeggnwhkg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91372jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91373yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91374zdlpuopuiu;

        public lqeggnwhkg(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91374zdlpuopuiu = jpowsppfyaVar;
            this.f91373yggfygwlhe = j13;
            this.f91372jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91374zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91373yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91372jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wkgbmnqykc.f91446iobyxmoadg);
        }
    }

    public static final class nufgyqmvbu implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91375jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91376yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91377zdlpuopuiu;

        public nufgyqmvbu(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91377zdlpuopuiu = jpowsppfyaVar;
            this.f91376yggfygwlhe = j13;
            this.f91375jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91377zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91376yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91375jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.esjtqupxsv.f91428iobyxmoadg);
        }
    }

    public static final class ojitshcjhn implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91378jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91379yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91380zdlpuopuiu;

        public ojitshcjhn(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91380zdlpuopuiu = jpowsppfyaVar;
            this.f91379yggfygwlhe = j13;
            this.f91378jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91380zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91379yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91378jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.draadjrbmk.f91425iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ yi0.iobyxmoadg f91381iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91382jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91383yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91384zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar, yi0.iobyxmoadg iobyxmoadgVar) {
            this.f91384zdlpuopuiu = jpowsppfyaVar;
            this.f91383yggfygwlhe = j13;
            this.f91382jyumaefscl = eablkybsjgVar;
            this.f91381iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91384zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91383yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91382jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.lqeggnwhkg.f91436iobyxmoadg);
            this.f91381iwizpuwonk.f125370vdvldrhtss.f65543zoijcleaow.yggfygwlhe();
        }
    }

    static final class rgvfuqvkyq implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fj0.vdvldrhtss f91385yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ fj0.vdvldrhtss f91387zdlpuopuiu;

            iobyxmoadg(fj0.vdvldrhtss vdvldrhtssVar) {
                this.f91387zdlpuopuiu = vdvldrhtssVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-486299779, i13, -1, "ru.myspar.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:126)");
                }
                au.wkgbmnqykc.zoijcleaow(this.f91387zdlpuopuiu.zynmafqrjb(), cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), null, null, 0L, 0L, draadjrbmkVar, 48, 60);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        rgvfuqvkyq(fj0.vdvldrhtss vdvldrhtssVar) {
            this.f91385yggfygwlhe = vdvldrhtssVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1161004510, i13, -1, "ru.myspar.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:123)");
            }
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(eablkybsjg.this.wkgbmnqykc()) ? y50.nufgyqmvbu.Dark : y50.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-486299779, true, new iobyxmoadg(this.f91385yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class vdvldrhtss implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fj0.vdvldrhtss f91388yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f91390yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ fj0.vdvldrhtss f91391zdlpuopuiu;

            iobyxmoadg(fj0.vdvldrhtss vdvldrhtssVar, eablkybsjg eablkybsjgVar) {
                this.f91391zdlpuopuiu = vdvldrhtssVar;
                this.f91390yggfygwlhe = eablkybsjgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn eablkybsjg(eablkybsjg eablkybsjgVar, String article, String name) {
                zdlpuopuiu.btonecajqb(article, "article");
                zdlpuopuiu.btonecajqb(name, "name");
                eablkybsjgVar.iwizpuwonk(article, name);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gxszxtbevo(eablkybsjg eablkybsjgVar, HintUiModel hint, pu.wkgbmnqykc product) {
                zdlpuopuiu.btonecajqb(hint, "hint");
                zdlpuopuiu.btonecajqb(product, "product");
                eablkybsjgVar.ppxfxbqfkf(new ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp(hint, new AnalyticElement.ProductItemElement(product.wkgbmnqykc(), product.agtfadlqog())));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                ppxfxbqfkf((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void ppxfxbqfkf(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1500829748, i13, -1, "ru.myspar.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:182)");
                }
                List listDraadjrbmk = this.f91391zdlpuopuiu.draadjrbmk();
                draadjrbmkVar.sopmlzcsov(-1375743746);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f91390yggfygwlhe);
                final eablkybsjg eablkybsjgVar = this.f91390yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.rgvfuqvkyq() { // from class: ru.myspar.orders.impl.screens.specific.presentation.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.vdvldrhtss.iobyxmoadg.eablkybsjg(eablkybsjgVar, (String) obj, (String) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1375738400);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f91390yggfygwlhe);
                final eablkybsjg eablkybsjgVar2 = this.f91390yggfygwlhe;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.rgvfuqvkyq() { // from class: ru.myspar.orders.impl.screens.specific.presentation.lqeggnwhkg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.vdvldrhtss.iobyxmoadg.gxszxtbevo(eablkybsjgVar2, (HintUiModel) obj, (pu.wkgbmnqykc) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                esjtqupxsv.wkgbmnqykc(listDraadjrbmk, rgvfuqvkyqVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        vdvldrhtss(fj0.vdvldrhtss vdvldrhtssVar) {
            this.f91388yggfygwlhe = vdvldrhtssVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1649644953, i13, -1, "ru.myspar.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:179)");
            }
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(eablkybsjg.this.wkgbmnqykc()) ? y50.nufgyqmvbu.Dark : y50.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1500829748, true, new iobyxmoadg(this.f91388yggfygwlhe, eablkybsjg.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wflxmlrfwp implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91392jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91393yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91394zdlpuopuiu;

        public wflxmlrfwp(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91394zdlpuopuiu = jpowsppfyaVar;
            this.f91393yggfygwlhe = j13;
            this.f91392jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91394zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91393yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91392jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.ojitshcjhn.f91438iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f91395jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91396yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91397zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f91397zdlpuopuiu = jpowsppfyaVar;
            this.f91396yggfygwlhe = j13;
            this.f91395jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91397zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91396yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91395jyumaefscl.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.nufgyqmvbu.f91437iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f91398iobyxmoadg;

        static {
            int[] iArr = new int[OrderPickupStatus.values().length];
            try {
                iArr[OrderPickupStatus.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPickupStatus.ON_MY_WAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPickupStatus.IN_CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderPickupStatus.IN_SHOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderPickupStatus.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f91398iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(ee0.ppxfxbqfkf imageUtils, tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f91350jyumaefscl = imageUtils;
        this.f91349iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fj0.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.esjtqupxsv(this.f34041zdlpuopuiu);
            }
        });
        yi0.iobyxmoadg iobyxmoadgVar = (yi0.iobyxmoadg) binding.invoke();
        ComposeView cvActionBar = iobyxmoadgVar.f125335agtfadlqog;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(xi0.lqeggnwhkg.specific_order_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: fj0.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.yggfygwlhe(this.f34037zdlpuopuiu);
            }
        }, null, null, 109, null);
        RecyclerView recyclerView = iobyxmoadgVar.f125357lereixgezr;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, rgvfuqvkyq(), (a6.iobyxmoadg) binding.invoke());
        t40.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = t40.zoijcleaow.f109665lqeggnwhkg;
        Context context = recyclerView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        recyclerView.btonecajqb(iobyxmoadgVar2.iobyxmoadg(context));
        iobyxmoadgVar.f125380zynmafqrjb.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: fj0.zdlpuopuiu
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.jyumaefscl(this.f34092iobyxmoadg);
            }
        });
        MaterialButton btnCancelOrder = iobyxmoadgVar.f125366ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancelOrder, "btnCancelOrder");
        btnCancelOrder.setOnClickListener(new lqeggnwhkg(new jpowsppfya(), 400L, this));
        MaterialButton btnTrackMyOrder = iobyxmoadgVar.f125371wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(btnTrackMyOrder, "btnTrackMyOrder");
        btnTrackMyOrder.setOnClickListener(new nufgyqmvbu(new jpowsppfya(), 400L, this));
        MaterialButton btnRepeatOrder = iobyxmoadgVar.f125336btonecajqb;
        zdlpuopuiu.dxjokdxxww(btnRepeatOrder, "btnRepeatOrder");
        btnRepeatOrder.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialButton btnPay = iobyxmoadgVar.f125361nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(btnPay, "btnPay");
        btnPay.setOnClickListener(new btonecajqb(new jpowsppfya(), 400L, this));
        MaterialButton btnCall = iobyxmoadgVar.f125379zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnCall, "btnCall");
        btnCall.setOnClickListener(new gtknphoqwx(new jpowsppfya(), 400L, this));
        MaterialButton btnOnMyWay = iobyxmoadgVar.f125359lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(btnOnMyWay, "btnOnMyWay");
        btnOnMyWay.setOnClickListener(new draadjrbmk(new jpowsppfya(), 400L, this));
        MaterialButton btnInPlace = iobyxmoadgVar.f125346gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(btnInPlace, "btnInPlace");
        btnInPlace.setOnClickListener(new wflxmlrfwp(new jpowsppfya(), 400L, this));
        MaterialButton btnRateOrder = iobyxmoadgVar.f125342dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(btnRateOrder, "btnRateOrder");
        btnRateOrder.setOnClickListener(new agtfadlqog(new jpowsppfya(), 400L, this));
        MaterialButton btnEditOrder = iobyxmoadgVar.f125343eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnEditOrder, "btnEditOrder");
        btnEditOrder.setOnClickListener(new ojitshcjhn(new jpowsppfya(), 400L, this));
        FrameLayout flCopyOrderNumber = iobyxmoadgVar.f125367rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(flCopyOrderNumber, "flCopyOrderNumber");
        flCopyOrderNumber.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this, iobyxmoadgVar));
        MaterialButton btnDeleteAll = iobyxmoadgVar.f125372wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnDeleteAll, "btnDeleteAll");
        btnDeleteAll.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, this));
        MaterialButton btnSendReplacement = iobyxmoadgVar.f125345gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(btnSendReplacement, "btnSendReplacement");
        btnSendReplacement.setOnClickListener(new ViewOnClickListenerC2120eablkybsjg(new jpowsppfya(), 400L, this));
        MaterialButton btnTipsOrder = iobyxmoadgVar.f125340draadjrbmk;
        zdlpuopuiu.dxjokdxxww(btnTipsOrder, "btnTipsOrder");
        btnTipsOrder.setOnClickListener(new gxszxtbevo(new jpowsppfya(), 400L, this));
    }

    private final void cdpycssgdh(yi0.iobyxmoadg iobyxmoadgVar, OrderPickupStatus orderPickupStatus, boolean z13) {
        int i13 = zoijcleaow.f91398iobyxmoadg[orderPickupStatus.ordinal()];
        if (i13 == 1) {
            LinearLayout pickupStatusContainer = iobyxmoadgVar.f125352iwizpuwonk;
            zdlpuopuiu.dxjokdxxww(pickupStatusContainer, "pickupStatusContainer");
            pickupStatusContainer.setVisibility(z13 ? 0 : 8);
            MaterialButton btnInPlace = iobyxmoadgVar.f125346gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(btnInPlace, "btnInPlace");
            btnInPlace.setVisibility(0);
            MaterialButton btnOnMyWay = iobyxmoadgVar.f125359lqeggnwhkg;
            zdlpuopuiu.dxjokdxxww(btnOnMyWay, "btnOnMyWay");
            btnOnMyWay.setVisibility(0);
            return;
        }
        if (i13 == 2) {
            LinearLayout pickupStatusContainer2 = iobyxmoadgVar.f125352iwizpuwonk;
            zdlpuopuiu.dxjokdxxww(pickupStatusContainer2, "pickupStatusContainer");
            pickupStatusContainer2.setVisibility(z13 ? 0 : 8);
            MaterialButton btnInPlace2 = iobyxmoadgVar.f125346gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(btnInPlace2, "btnInPlace");
            btnInPlace2.setVisibility(0);
            MaterialButton btnOnMyWay2 = iobyxmoadgVar.f125359lqeggnwhkg;
            zdlpuopuiu.dxjokdxxww(btnOnMyWay2, "btnOnMyWay");
            btnOnMyWay2.setVisibility(8);
            return;
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LinearLayout pickupStatusContainer3 = iobyxmoadgVar.f125352iwizpuwonk;
        zdlpuopuiu.dxjokdxxww(pickupStatusContainer3, "pickupStatusContainer");
        pickupStatusContainer3.setVisibility(8);
        MaterialButton btnInPlace3 = iobyxmoadgVar.f125346gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(btnInPlace3, "btnInPlace");
        btnInPlace3.setVisibility(8);
        MaterialButton btnOnMyWay3 = iobyxmoadgVar.f125359lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(btnOnMyWay3, "btnOnMyWay");
        btnOnMyWay3.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj0.zoijcleaow esjtqupxsv(final eablkybsjg eablkybsjgVar) {
        return new gj0.zoijcleaow(new tg.rgvfuqvkyq() { // from class: fj0.yggfygwlhe
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.lereixgezr(this.f34091zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: fj0.jyumaefscl
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.pmvmpeiblj(this.f34036zdlpuopuiu, (HintUiModel) obj, (ru.iobyxmoadg) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: fj0.iwizpuwonk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.zynmafqrjb(this.f34035zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.draadjrbmk() { // from class: fj0.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.orders.impl.screens.specific.presentation.eablkybsjg.istkbnxepw(this.f34030zdlpuopuiu, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(eablkybsjg eablkybsjgVar, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwizpuwonk(String str, String str2) {
        ppxfxbqfkf(new ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm(str, new AnalyticElement.ProductItemElement(str, str2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.yggfygwlhe.f91447iobyxmoadg);
    }

    private final void kcexrzcfyt(yi0.iobyxmoadg iobyxmoadgVar, boolean z13) {
        LinearLayout llPriceBlock = iobyxmoadgVar.f125355kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(llPriceBlock, "llPriceBlock");
        llPriceBlock.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(eablkybsjg eablkybsjgVar, String article, String name) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        eablkybsjgVar.iwizpuwonk(article, name);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void oxmwwwfdhm(yi0.iobyxmoadg iobyxmoadgVar, boolean z13) {
        MaterialTextView tvOrderList = iobyxmoadgVar.f125364pkzmftpjix;
        zdlpuopuiu.dxjokdxxww(tvOrderList, "tvOrderList");
        tvOrderList.setVisibility(z13 ? 0 : 8);
        ComposeView orderProductsList = iobyxmoadgVar.f125376yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(orderProductsList, "orderProductsList");
        orderProductsList.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(eablkybsjg eablkybsjgVar, HintUiModel hint, ru.iobyxmoadg product) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(product, "product");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp(hint, new AnalyticElement.ProductItemElement(product.getId(), product.ojitshcjhn())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final gj0.zoijcleaow rgvfuqvkyq() {
        return (gj0.zoijcleaow) this.f91349iwizpuwonk.getValue();
    }

    private final void vdvldrhtss(yi0.iobyxmoadg iobyxmoadgVar, boolean z13) {
        MaterialTextView tvNotAvailableList = iobyxmoadgVar.f125373wwaezpbzkn;
        zdlpuopuiu.dxjokdxxww(tvNotAvailableList, "tvNotAvailableList");
        tvNotAvailableList.setVisibility(z13 ? 0 : 8);
        RecyclerView rvReplaces = iobyxmoadgVar.f125357lereixgezr;
        zdlpuopuiu.dxjokdxxww(rvReplaces, "rvReplaces");
        rvReplaces.setVisibility(z13 ? 0 : 8);
        MaterialButton btnDeleteAll = iobyxmoadgVar.f125372wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnDeleteAll, "btnDeleteAll");
        btnDeleteAll.setVisibility(z13 ? 0 : 8);
        MaterialButton btnSendReplacement = iobyxmoadgVar.f125345gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(btnSendReplacement, "btnSendReplacement");
        btnSendReplacement.setVisibility(z13 ? 0 : 8);
    }

    private final void yadqdtsiqt(ImageView imageView, String str) {
        if (kcexrzcfyt.zfvoamnweg(str)) {
            return;
        }
        int i13 = imageView.getContext().getResources().getDisplayMetrics().widthPixels;
        Context context = imageView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        imageView.setImageBitmap(this.f91350jyumaefscl.iobyxmoadg(str, androidx.core.content.iobyxmoadg.getColor(imageView.getContext(), s40.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(imageView.getContext(), s40.wkgbmnqykc.spar_color_qr_space), i13 - (ct.iobyxmoadg.iobyxmoadg(64, context) * 2), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.zoijcleaow.f91449iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zdlpuopuiu(yi0.iobyxmoadg iobyxmoadgVar, boolean z13) {
        ConstraintLayout root = iobyxmoadgVar.f125354jyumaefscl.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(eablkybsjg eablkybsjgVar, String productArticle, String replaceArticle) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(replaceArticle, "replaceArticle");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk(productArticle, replaceArticle));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yi0.iobyxmoadg binding, fj0.vdvldrhtss model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f125362ojitshcjhn.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1161004510, true, new rgvfuqvkyq(model)));
        binding.f125378zdlpuopuiu.f65336zoijcleaow.setText(model.btonecajqb());
        ConstraintLayout root = binding.f125378zdlpuopuiu.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(model.lmojexxdyd() ? 0 : 8);
        binding.f125354jyumaefscl.f65511ppxfxbqfkf.setText(model.lereixgezr());
        binding.f125377ylkuphrtab.setText(model.gtknphoqwx());
        binding.f125369tzroggbefp.setText(model.jyumaefscl());
        binding.f125341dsvhmnatus.setText(model.iwizpuwonk());
        binding.f125358lmojexxdyd.setText(model.dxjokdxxww());
        MaterialTextView tvPartnerType = binding.f125348hkdspvbjdz;
        zdlpuopuiu.dxjokdxxww(tvPartnerType, "tvPartnerType");
        tvPartnerType.setVisibility(model.pkzmftpjix() ? 0 : 8);
        MaterialTextView tvPartnerName = binding.f125353jpowsppfya;
        zdlpuopuiu.dxjokdxxww(tvPartnerName, "tvPartnerName");
        tvPartnerName.setVisibility(model.pkzmftpjix() ? 0 : 8);
        binding.f125348hkdspvbjdz.setText(model.ojitshcjhn());
        binding.f125353jpowsppfya.setText(wkgbmnqykc().getString(xi0.lqeggnwhkg.quoted_format, model.agtfadlqog()));
        binding.f125375yadqdtsiqt.setText(model.lqeggnwhkg());
        binding.f125351istkbnxepw.setText(model.iobyxmoadg());
        binding.f125337cdpycssgdh.setText(model.gxszxtbevo());
        binding.f125347hcddaimhww.setText(model.wflxmlrfwp());
        binding.f125338cllcsxoeiz.setText(model.oxmwwwfdhm());
        binding.f125360mbcevpiqjq.setText(model.istkbnxepw());
        binding.f125366ppxfxbqfkf.setEnabled(!model.iozdgvuglv());
        MaterialButton btnCancelOrder = binding.f125366ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancelOrder, "btnCancelOrder");
        btnCancelOrder.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        MaterialButton btnPay = binding.f125361nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(btnPay, "btnPay");
        btnPay.setVisibility(model.rgvfuqvkyq() ? 0 : 8);
        binding.f125361nufgyqmvbu.setEnabled(model.vdvldrhtss());
        MaterialButton btnCall = binding.f125379zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnCall, "btnCall");
        btnCall.setVisibility(model.zoijcleaow() ? 0 : 8);
        MaterialButton btnTrackMyOrder = binding.f125371wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(btnTrackMyOrder, "btnTrackMyOrder");
        btnTrackMyOrder.setVisibility(model.cdpycssgdh() ? 0 : 8);
        MaterialButton btnRateOrder = binding.f125342dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(btnRateOrder, "btnRateOrder");
        btnRateOrder.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        AppCompatRatingBar rbRatingApp = binding.f125339cqumvgiudr;
        zdlpuopuiu.dxjokdxxww(rbRatingApp, "rbRatingApp");
        rbRatingApp.setVisibility(model.hkdspvbjdz() ? 0 : 8);
        MaterialTextView tvRatingTitle = binding.f125356kegysxyocb;
        zdlpuopuiu.dxjokdxxww(tvRatingTitle, "tvRatingTitle");
        tvRatingTitle.setVisibility(model.hkdspvbjdz() ? 0 : 8);
        binding.f125339cqumvgiudr.setRating(model.yggfygwlhe());
        binding.f125343eablkybsjg.setEnabled(!model.iozdgvuglv());
        MaterialButton btnEditOrder = binding.f125343eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnEditOrder, "btnEditOrder");
        btnEditOrder.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        binding.f125343eablkybsjg.setText(wkgbmnqykc().getString(model.wwaezpbzkn() ? xi0.lqeggnwhkg.specific_order_edit_order_continue : xi0.lqeggnwhkg.specific_order_edit_order));
        binding.f125345gtknphoqwx.setEnabled(model.eablkybsjg());
        cdpycssgdh(binding, model.kcexrzcfyt(), model.hcddaimhww());
        zdlpuopuiu(binding, model.cllcsxoeiz());
        vdvldrhtss(binding, model.yadqdtsiqt());
        oxmwwwfdhm(binding, model.ylkuphrtab());
        kcexrzcfyt(binding, model.jpowsppfya());
        binding.f125376yggfygwlhe.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1649644953, true, new vdvldrhtss(model)));
        rgvfuqvkyq().wkgbmnqykc(model.esjtqupxsv());
        boolean zZfvoamnweg = kcexrzcfyt.zfvoamnweg(model.zdlpuopuiu());
        MaterialTextView tvPostamatCodeTitle = binding.f125374wypolnanlu;
        zdlpuopuiu.dxjokdxxww(tvPostamatCodeTitle, "tvPostamatCodeTitle");
        tvPostamatCodeTitle.setVisibility(!zZfvoamnweg ? 0 : 8);
        MaterialTextView tvPostamatCodeValue = binding.f125368stevsuqkhv;
        zdlpuopuiu.dxjokdxxww(tvPostamatCodeValue, "tvPostamatCodeValue");
        tvPostamatCodeValue.setVisibility(!zZfvoamnweg ? 0 : 8);
        AppCompatImageView ivPostamatQrCode = binding.f125363oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ivPostamatQrCode, "ivPostamatQrCode");
        ivPostamatQrCode.setVisibility(!zZfvoamnweg ? 0 : 8);
        binding.f125368stevsuqkhv.setText(model.zdlpuopuiu());
        AppCompatImageView ivPostamatQrCode2 = binding.f125363oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ivPostamatQrCode2, "ivPostamatQrCode");
        yadqdtsiqt(ivPostamatQrCode2, model.zdlpuopuiu());
        binding.f125380zynmafqrjb.setRefreshing(model.iozdgvuglv());
        MaterialButton btnTipsOrder = binding.f125340draadjrbmk;
        zdlpuopuiu.dxjokdxxww(btnTipsOrder, "btnTipsOrder");
        btnTipsOrder.setVisibility(model.pmvmpeiblj() ? 0 : 8);
        binding.f125336btonecajqb.setEnabled(!model.iozdgvuglv());
        MaterialButton btnRepeatOrder = binding.f125336btonecajqb;
        zdlpuopuiu.dxjokdxxww(btnRepeatOrder, "btnRepeatOrder");
        btnRepeatOrder.setVisibility(model.cqumvgiudr() ? 0 : 8);
        if (model.cqumvgiudr()) {
            MaterialButton materialButton = binding.f125336btonecajqb;
            if (!model.pmvmpeiblj()) {
                zdlpuopuiu.lqeggnwhkg(materialButton);
                c60.lqeggnwhkg.zoijcleaow(materialButton, s40.wkgbmnqykc.csl_primary);
                materialButton.setTextColor(androidx.core.content.iobyxmoadg.getColor(materialButton.getContext(), s40.wkgbmnqykc.csl_text_static_white));
            } else {
                zdlpuopuiu.lqeggnwhkg(materialButton);
                c60.lqeggnwhkg.zoijcleaow(materialButton, s40.wkgbmnqykc.transparent);
                materialButton.setStrokeColorResource(s40.wkgbmnqykc.csl_primary);
                materialButton.setTextColor(androidx.core.content.iobyxmoadg.getColor(materialButton.getContext(), s40.wkgbmnqykc.csl_primary));
                materialButton.setStrokeWidthResource(s40.eablkybsjg.content_margin_2);
            }
        }
    }
}
