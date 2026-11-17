package ru.myspar.proloyalty.orders.impl.screens.specific.presentation;

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
import bt0.esjtqupxsv;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f98992cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f98993esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f98994iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ac1.ppxfxbqfkf f98995jyumaefscl;

    public static final class agtfadlqog implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f98996jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f98997yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f98998zdlpuopuiu;

        public agtfadlqog(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f98998zdlpuopuiu = jpowsppfyaVar;
            this.f98997yggfygwlhe = j13;
            this.f98996jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f98998zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f98997yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f98996jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.kcexrzcfyt.f99085iobyxmoadg);
        }
    }

    public static final class btonecajqb implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f98999jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99000yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99001zdlpuopuiu;

        public btonecajqb(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99001zdlpuopuiu = jpowsppfyaVar;
            this.f99000yggfygwlhe = j13;
            this.f98999jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99001zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99000yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f98999jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.vdvldrhtss.f99093iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99002jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99003yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99004zdlpuopuiu;

        public draadjrbmk(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99004zdlpuopuiu = jpowsppfyaVar;
            this.f99003yggfygwlhe = j13;
            this.f99002jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99004zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99003yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99002jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.rgvfuqvkyq.f99092iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99005jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99006yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99007zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99007zdlpuopuiu = jpowsppfyaVar;
            this.f99006yggfygwlhe = j13;
            this.f99005jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99007zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99006yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99005jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.jyumaefscl.f99084iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC2367eablkybsjg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99008jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99009yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99010zdlpuopuiu;

        public ViewOnClickListenerC2367eablkybsjg(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99010zdlpuopuiu = jpowsppfyaVar;
            this.f99009yggfygwlhe = j13;
            this.f99008jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99010zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99009yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99008jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.gxszxtbevo.f99080iobyxmoadg);
        }
    }

    public static final class gtknphoqwx implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99011jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99012yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99013zdlpuopuiu;

        public gtknphoqwx(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99013zdlpuopuiu = jpowsppfyaVar;
            this.f99012yggfygwlhe = j13;
            this.f99011jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99013zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99012yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99011jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.C2369ppxfxbqfkf.f99091iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99014jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99015yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99016zdlpuopuiu;

        public gxszxtbevo(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99016zdlpuopuiu = jpowsppfyaVar;
            this.f99015yggfygwlhe = j13;
            this.f99014jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99016zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99015yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99014jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.cqumvgiudr.f99074iobyxmoadg);
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
        final /* synthetic */ eablkybsjg f99017jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99018yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99019zdlpuopuiu;

        public lqeggnwhkg(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99019zdlpuopuiu = jpowsppfyaVar;
            this.f99018yggfygwlhe = j13;
            this.f99017jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99019zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99018yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99017jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wkgbmnqykc.f99096iobyxmoadg);
        }
    }

    public static final class nufgyqmvbu implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99020jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99021yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99022zdlpuopuiu;

        public nufgyqmvbu(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99022zdlpuopuiu = jpowsppfyaVar;
            this.f99021yggfygwlhe = j13;
            this.f99020jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99022zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99021yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99020jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.esjtqupxsv.f99078iobyxmoadg);
        }
    }

    public static final class ojitshcjhn implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99023jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99024yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99025zdlpuopuiu;

        public ojitshcjhn(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99025zdlpuopuiu = jpowsppfyaVar;
            this.f99024yggfygwlhe = j13;
            this.f99023jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99025zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99024yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99023jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.draadjrbmk.f99075iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fg1.vdvldrhtss f99026yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f99028yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ fg1.vdvldrhtss f99029zdlpuopuiu;

            iobyxmoadg(fg1.vdvldrhtss vdvldrhtssVar, eablkybsjg eablkybsjgVar) {
                this.f99029zdlpuopuiu = vdvldrhtssVar;
                this.f99028yggfygwlhe = eablkybsjgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn ppxfxbqfkf(eablkybsjg eablkybsjgVar, String article, String name) {
                zdlpuopuiu.btonecajqb(article, "article");
                zdlpuopuiu.btonecajqb(name, "name");
                eablkybsjgVar.esjtqupxsv(article, name);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-909676731, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:204)");
                }
                List listCqumvgiudr = this.f99029zdlpuopuiu.cqumvgiudr();
                draadjrbmkVar.sopmlzcsov(-1707206743);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f99028yggfygwlhe);
                final eablkybsjg eablkybsjgVar = this.f99028yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.nufgyqmvbu
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.oxmwwwfdhm.iobyxmoadg.ppxfxbqfkf(eablkybsjgVar, (String) obj, (String) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                hg1.ppxfxbqfkf.ppxfxbqfkf(null, listCqumvgiudr, 16, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 384, 1);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        oxmwwwfdhm(fg1.vdvldrhtss vdvldrhtssVar) {
            this.f99026yggfygwlhe = vdvldrhtssVar;
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
                jyumaefscl.ntlheqmsrt(483269184, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:203)");
            }
            eablkybsjg eablkybsjgVar = eablkybsjg.this;
            l41.zoijcleaow.zoijcleaow(eablkybsjgVar.vdvldrhtss(eablkybsjgVar.wkgbmnqykc()), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-909676731, true, new iobyxmoadg(this.f99026yggfygwlhe, eablkybsjg.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ yf1.iobyxmoadg f99030iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99031jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99032yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99033zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar, yf1.iobyxmoadg iobyxmoadgVar) {
            this.f99033zdlpuopuiu = jpowsppfyaVar;
            this.f99032yggfygwlhe = j13;
            this.f99031jyumaefscl = eablkybsjgVar;
            this.f99030iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99033zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99032yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99031jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.lqeggnwhkg.f99086iobyxmoadg);
            this.f99030iwizpuwonk.f124719vdvldrhtss.f128091zoijcleaow.yggfygwlhe();
        }
    }

    static final class rgvfuqvkyq implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fg1.vdvldrhtss f99034yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ fg1.vdvldrhtss f99036zdlpuopuiu;

            iobyxmoadg(fg1.vdvldrhtss vdvldrhtssVar) {
                this.f99036zdlpuopuiu = vdvldrhtssVar;
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
                    jyumaefscl.ntlheqmsrt(-1582722176, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:125)");
                }
                us0.wkgbmnqykc.zoijcleaow(this.f99036zdlpuopuiu.istkbnxepw(), cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), null, null, 0L, 0L, draadjrbmkVar, 48, 60);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        rgvfuqvkyq(fg1.vdvldrhtss vdvldrhtssVar) {
            this.f99034yggfygwlhe = vdvldrhtssVar;
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
                jyumaefscl.ntlheqmsrt(744467515, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:124)");
            }
            eablkybsjg eablkybsjgVar = eablkybsjg.this;
            l41.zoijcleaow.zoijcleaow(eablkybsjgVar.vdvldrhtss(eablkybsjgVar.wkgbmnqykc()), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1582722176, true, new iobyxmoadg(this.f99034yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class vdvldrhtss implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fg1.vdvldrhtss f99037yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f99039yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ fg1.vdvldrhtss f99040zdlpuopuiu;

            iobyxmoadg(fg1.vdvldrhtss vdvldrhtssVar, eablkybsjg eablkybsjgVar) {
                this.f99040zdlpuopuiu = vdvldrhtssVar;
                this.f99039yggfygwlhe = eablkybsjgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn eablkybsjg(eablkybsjg eablkybsjgVar, String article, String name) {
                zdlpuopuiu.btonecajqb(article, "article");
                zdlpuopuiu.btonecajqb(name, "name");
                eablkybsjgVar.esjtqupxsv(article, name);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gxszxtbevo(eablkybsjg eablkybsjgVar, HintUiModel hint, jt0.wkgbmnqykc product) {
                zdlpuopuiu.btonecajqb(hint, "hint");
                zdlpuopuiu.btonecajqb(product, "product");
                eablkybsjgVar.ppxfxbqfkf(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp(hint, new AnalyticElement.ProductItemElement(product.wkgbmnqykc(), product.agtfadlqog())));
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
                    jyumaefscl.ntlheqmsrt(59771881, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:180)");
                }
                List listDraadjrbmk = this.f99040zdlpuopuiu.draadjrbmk();
                draadjrbmkVar.sopmlzcsov(-1707246879);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f99039yggfygwlhe);
                final eablkybsjg eablkybsjgVar = this.f99039yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.vdvldrhtss.iobyxmoadg.eablkybsjg(eablkybsjgVar, (String) obj, (String) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1707241684);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f99039yggfygwlhe);
                final eablkybsjg eablkybsjgVar2 = this.f99039yggfygwlhe;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.lqeggnwhkg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.vdvldrhtss.iobyxmoadg.gxszxtbevo(eablkybsjgVar2, (HintUiModel) obj, (jt0.wkgbmnqykc) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                esjtqupxsv.wkgbmnqykc(listDraadjrbmk, 16, rgvfuqvkyqVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 48);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        vdvldrhtss(fg1.vdvldrhtss vdvldrhtssVar) {
            this.f99037yggfygwlhe = vdvldrhtssVar;
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
                jyumaefscl.ntlheqmsrt(-1188896284, i13, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderViewImpl.render.<anonymous>.<anonymous> (SpecificOrderViewImpl.kt:179)");
            }
            eablkybsjg eablkybsjgVar = eablkybsjg.this;
            l41.zoijcleaow.zoijcleaow(eablkybsjgVar.vdvldrhtss(eablkybsjgVar.wkgbmnqykc()), ezmngbhpjk.nufgyqmvbu.eablkybsjg(59771881, true, new iobyxmoadg(this.f99037yggfygwlhe, eablkybsjg.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wflxmlrfwp implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99041jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99043zdlpuopuiu;

        public wflxmlrfwp(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99043zdlpuopuiu = jpowsppfyaVar;
            this.f99042yggfygwlhe = j13;
            this.f99041jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99043zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99042yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99041jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.ojitshcjhn.f99088iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f99044jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99045yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99046zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, eablkybsjg eablkybsjgVar) {
            this.f99046zdlpuopuiu = jpowsppfyaVar;
            this.f99045yggfygwlhe = j13;
            this.f99044jyumaefscl = eablkybsjgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99046zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99045yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99044jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.nufgyqmvbu.f99087iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f99047iobyxmoadg;

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
            f99047iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(ac1.ppxfxbqfkf imageUtils, tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f98995jyumaefscl = imageUtils;
        this.f98994iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fg1.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.pmvmpeiblj(this.f33758zdlpuopuiu);
            }
        });
        yf1.iobyxmoadg iobyxmoadgVar = (yf1.iobyxmoadg) binding.invoke();
        ComposeView cvActionBar = iobyxmoadgVar.f124682agtfadlqog;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(xf1.lqeggnwhkg.proloyalty_specific_order_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: fg1.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.iwizpuwonk(this.f33755zdlpuopuiu);
            }
        }, null, null, 109, null);
        RecyclerView recyclerView = iobyxmoadgVar.f124713pmvmpeiblj;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, oxmwwwfdhm(), (a6.iobyxmoadg) binding.invoke());
        c31.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = c31.zoijcleaow.f18695lqeggnwhkg;
        Context context = recyclerView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        recyclerView.btonecajqb(iobyxmoadgVar2.iobyxmoadg(context));
        iobyxmoadgVar.f124698istkbnxepw.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: fg1.zdlpuopuiu
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.cqumvgiudr(this.f33810iobyxmoadg);
            }
        });
        MaterialButton btnCancelOrder = iobyxmoadgVar.f124714ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancelOrder, "btnCancelOrder");
        btnCancelOrder.setOnClickListener(new lqeggnwhkg(new jpowsppfya(), 400L, this));
        MaterialButton btnTrackMyOrder = iobyxmoadgVar.f124720wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(btnTrackMyOrder, "btnTrackMyOrder");
        btnTrackMyOrder.setOnClickListener(new nufgyqmvbu(new jpowsppfya(), 400L, this));
        MaterialButton btnRepeatOrder = iobyxmoadgVar.f124683btonecajqb;
        zdlpuopuiu.dxjokdxxww(btnRepeatOrder, "btnRepeatOrder");
        btnRepeatOrder.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialButton btnPay = iobyxmoadgVar.f124709nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(btnPay, "btnPay");
        btnPay.setOnClickListener(new btonecajqb(new jpowsppfya(), 400L, this));
        MaterialButton btnCall = iobyxmoadgVar.f124728zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnCall, "btnCall");
        btnCall.setOnClickListener(new gtknphoqwx(new jpowsppfya(), 400L, this));
        MaterialButton btnOnMyWay = iobyxmoadgVar.f124706lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(btnOnMyWay, "btnOnMyWay");
        btnOnMyWay.setOnClickListener(new draadjrbmk(new jpowsppfya(), 400L, this));
        MaterialButton btnInPlace = iobyxmoadgVar.f124693gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(btnInPlace, "btnInPlace");
        btnInPlace.setOnClickListener(new wflxmlrfwp(new jpowsppfya(), 400L, this));
        MaterialButton btnRateOrder = iobyxmoadgVar.f124689dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(btnRateOrder, "btnRateOrder");
        btnRateOrder.setOnClickListener(new agtfadlqog(new jpowsppfya(), 400L, this));
        MaterialButton btnEditOrder = iobyxmoadgVar.f124690eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnEditOrder, "btnEditOrder");
        btnEditOrder.setOnClickListener(new ojitshcjhn(new jpowsppfya(), 400L, this));
        FrameLayout flCopyOrderNumber = iobyxmoadgVar.f124715rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(flCopyOrderNumber, "flCopyOrderNumber");
        flCopyOrderNumber.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this, iobyxmoadgVar));
        MaterialButton btnDeleteAll = iobyxmoadgVar.f124721wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnDeleteAll, "btnDeleteAll");
        btnDeleteAll.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, this));
        MaterialButton btnSendReplacement = iobyxmoadgVar.f124692gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(btnSendReplacement, "btnSendReplacement");
        btnSendReplacement.setOnClickListener(new ViewOnClickListenerC2367eablkybsjg(new jpowsppfya(), 400L, this));
        MaterialButton btnTipsOrder = iobyxmoadgVar.f124687draadjrbmk;
        zdlpuopuiu.dxjokdxxww(btnTipsOrder, "btnTipsOrder");
        btnTipsOrder.setOnClickListener(new gxszxtbevo(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cdpycssgdh(eablkybsjg eablkybsjgVar, String productArticle, String replaceArticle) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(replaceArticle, "replaceArticle");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iwizpuwonk(productArticle, replaceArticle));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.yggfygwlhe.f99097iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void esjtqupxsv(String str, String str2) {
        ppxfxbqfkf(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.oxmwwwfdhm(str, new AnalyticElement.ProductItemElement(str, str2)));
    }

    private final void iozdgvuglv(yf1.iobyxmoadg iobyxmoadgVar, OrderPickupStatus orderPickupStatus, boolean z13) {
        int i13 = zoijcleaow.f99047iobyxmoadg[orderPickupStatus.ordinal()];
        if (i13 == 1) {
            LinearLayout pickupStatusContainer = iobyxmoadgVar.f124699iwizpuwonk;
            zdlpuopuiu.dxjokdxxww(pickupStatusContainer, "pickupStatusContainer");
            pickupStatusContainer.setVisibility(z13 ? 0 : 8);
            MaterialButton btnInPlace = iobyxmoadgVar.f124693gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(btnInPlace, "btnInPlace");
            btnInPlace.setVisibility(0);
            MaterialButton btnOnMyWay = iobyxmoadgVar.f124706lqeggnwhkg;
            zdlpuopuiu.dxjokdxxww(btnOnMyWay, "btnOnMyWay");
            btnOnMyWay.setVisibility(0);
            return;
        }
        if (i13 == 2) {
            LinearLayout pickupStatusContainer2 = iobyxmoadgVar.f124699iwizpuwonk;
            zdlpuopuiu.dxjokdxxww(pickupStatusContainer2, "pickupStatusContainer");
            pickupStatusContainer2.setVisibility(z13 ? 0 : 8);
            MaterialButton btnInPlace2 = iobyxmoadgVar.f124693gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(btnInPlace2, "btnInPlace");
            btnInPlace2.setVisibility(0);
            MaterialButton btnOnMyWay2 = iobyxmoadgVar.f124706lqeggnwhkg;
            zdlpuopuiu.dxjokdxxww(btnOnMyWay2, "btnOnMyWay");
            btnOnMyWay2.setVisibility(8);
            return;
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LinearLayout pickupStatusContainer3 = iobyxmoadgVar.f124699iwizpuwonk;
        zdlpuopuiu.dxjokdxxww(pickupStatusContainer3, "pickupStatusContainer");
        pickupStatusContainer3.setVisibility(8);
        MaterialButton btnInPlace3 = iobyxmoadgVar.f124693gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(btnInPlace3, "btnInPlace");
        btnInPlace3.setVisibility(8);
        MaterialButton btnOnMyWay3 = iobyxmoadgVar.f124706lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(btnOnMyWay3, "btnOnMyWay");
        btnOnMyWay3.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(eablkybsjg eablkybsjgVar, HintUiModel hint, lt0.iobyxmoadg product) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(product, "product");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.wflxmlrfwp(hint, new AnalyticElement.ProductItemElement(product.getId(), product.wflxmlrfwp())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.zoijcleaow.f99099iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jyumaefscl(yf1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        ConstraintLayout root = iobyxmoadgVar.f124701jyumaefscl.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(z13 ? 0 : 8);
    }

    private final void kcexrzcfyt(yf1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        MaterialTextView tvNotAvailableList = iobyxmoadgVar.f124726ylkuphrtab;
        zdlpuopuiu.dxjokdxxww(tvNotAvailableList, "tvNotAvailableList");
        tvNotAvailableList.setVisibility(z13 ? 0 : 8);
        RecyclerView rvReplaces = iobyxmoadgVar.f124713pmvmpeiblj;
        zdlpuopuiu.dxjokdxxww(rvReplaces, "rvReplaces");
        rvReplaces.setVisibility(z13 ? 0 : 8);
        MaterialButton btnDeleteAll = iobyxmoadgVar.f124721wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnDeleteAll, "btnDeleteAll");
        btnDeleteAll.setVisibility(z13 ? 0 : 8);
        MaterialButton btnSendReplacement = iobyxmoadgVar.f124692gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(btnSendReplacement, "btnSendReplacement");
        btnSendReplacement.setVisibility(z13 ? 0 : 8);
    }

    private final void lmojexxdyd(ImageView imageView, String str) {
        if (kcexrzcfyt.zfvoamnweg(str)) {
            return;
        }
        int i13 = imageView.getContext().getResources().getDisplayMetrics().widthPixels;
        Context context = imageView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        imageView.setImageBitmap(this.f98995jyumaefscl.iobyxmoadg(str, androidx.core.content.iobyxmoadg.getColor(imageView.getContext(), b31.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(imageView.getContext(), b31.wkgbmnqykc.spar_color_qr_space), i13 - (wr0.iobyxmoadg.iobyxmoadg(64, context) * 2), 0));
    }

    private final gg1.iobyxmoadg oxmwwwfdhm() {
        return (gg1.iobyxmoadg) this.f98994iwizpuwonk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg1.iobyxmoadg pmvmpeiblj(final eablkybsjg eablkybsjgVar) {
        return new gg1.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fg1.yggfygwlhe
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.zynmafqrjb(this.f33809zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: fg1.jyumaefscl
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.istkbnxepw(this.f33754zdlpuopuiu, (HintUiModel) obj, (lt0.iobyxmoadg) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: fg1.iwizpuwonk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.cdpycssgdh(this.f33753zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.draadjrbmk() { // from class: fg1.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg.yadqdtsiqt(this.f33747zdlpuopuiu, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l41.nufgyqmvbu vdvldrhtss(Context context) {
        return p41.ppxfxbqfkf.eablkybsjg(context) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(eablkybsjg eablkybsjgVar, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.btonecajqb(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yggfygwlhe(yf1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        LinearLayout llPriceBlock = iobyxmoadgVar.f124702kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(llPriceBlock, "llPriceBlock");
        llPriceBlock.setVisibility(z13 ? 0 : 8);
    }

    private final void zdlpuopuiu(yf1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        MaterialTextView tvOrderList = iobyxmoadgVar.f124694hcddaimhww;
        zdlpuopuiu.dxjokdxxww(tvOrderList, "tvOrderList");
        tvOrderList.setVisibility(z13 ? 0 : 8);
        ComposeView orderProductsList = iobyxmoadgVar.f124725yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(orderProductsList, "orderProductsList");
        orderProductsList.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(eablkybsjg eablkybsjgVar, String article, String name) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        eablkybsjgVar.esjtqupxsv(article, name);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yf1.iobyxmoadg binding, fg1.vdvldrhtss model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f124710ojitshcjhn.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(744467515, true, new rgvfuqvkyq(model)));
        binding.f124727zdlpuopuiu.f128438zoijcleaow.setText(model.btonecajqb());
        ConstraintLayout root = binding.f124727zdlpuopuiu.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(model.wwaezpbzkn() ? 0 : 8);
        binding.f124701jyumaefscl.f128254ppxfxbqfkf.setText(model.pmvmpeiblj());
        binding.f124712pkzmftpjix.setText(model.gtknphoqwx());
        binding.f124707mbcevpiqjq.setText(model.jyumaefscl());
        binding.f124723wypolnanlu.setText(model.iwizpuwonk());
        binding.f124722wwaezpbzkn.setText(model.dxjokdxxww());
        MaterialTextView tvPartnerType = binding.f124685cllcsxoeiz;
        zdlpuopuiu.dxjokdxxww(tvPartnerType, "tvPartnerType");
        tvPartnerType.setVisibility(model.hcddaimhww() ? 0 : 8);
        MaterialTextView tvPartnerName = binding.f124695hkdspvbjdz;
        zdlpuopuiu.dxjokdxxww(tvPartnerName, "tvPartnerName");
        tvPartnerName.setVisibility(model.hcddaimhww() ? 0 : 8);
        binding.f124685cllcsxoeiz.setText(model.ojitshcjhn());
        binding.f124695hkdspvbjdz.setText(wkgbmnqykc().getString(xf1.lqeggnwhkg.proloyalty_quoted_format, model.agtfadlqog()));
        binding.f124697iozdgvuglv.setText(model.lqeggnwhkg());
        binding.f124684cdpycssgdh.setText(model.iobyxmoadg());
        binding.f124724yadqdtsiqt.setText(model.gxszxtbevo());
        binding.f124700jpowsppfya.setText(model.wflxmlrfwp());
        binding.f124688dsvhmnatus.setText(model.oxmwwwfdhm());
        binding.f124718ulzqkzuiru.setText(model.cdpycssgdh());
        binding.f124714ppxfxbqfkf.setEnabled(!model.lmojexxdyd());
        MaterialButton btnCancelOrder = binding.f124714ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancelOrder, "btnCancelOrder");
        btnCancelOrder.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        MaterialButton btnPay = binding.f124709nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(btnPay, "btnPay");
        btnPay.setVisibility(model.rgvfuqvkyq() ? 0 : 8);
        binding.f124709nufgyqmvbu.setEnabled(model.vdvldrhtss());
        MaterialButton btnCall = binding.f124728zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnCall, "btnCall");
        btnCall.setVisibility(model.zoijcleaow() ? 0 : 8);
        MaterialButton btnTrackMyOrder = binding.f124720wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(btnTrackMyOrder, "btnTrackMyOrder");
        btnTrackMyOrder.setVisibility(model.yadqdtsiqt() ? 0 : 8);
        MaterialButton btnRateOrder = binding.f124689dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(btnRateOrder, "btnRateOrder");
        btnRateOrder.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        AppCompatRatingBar rbRatingApp = binding.f124686cqumvgiudr;
        zdlpuopuiu.dxjokdxxww(rbRatingApp, "rbRatingApp");
        rbRatingApp.setVisibility(model.cllcsxoeiz() ? 0 : 8);
        MaterialTextView tvRatingTitle = binding.f124717tzroggbefp;
        zdlpuopuiu.dxjokdxxww(tvRatingTitle, "tvRatingTitle");
        tvRatingTitle.setVisibility(model.cllcsxoeiz() ? 0 : 8);
        binding.f124686cqumvgiudr.setRating(model.yggfygwlhe());
        binding.f124690eablkybsjg.setEnabled(!model.lmojexxdyd());
        MaterialButton btnEditOrder = binding.f124690eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnEditOrder, "btnEditOrder");
        btnEditOrder.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        binding.f124690eablkybsjg.setText(wkgbmnqykc().getString(model.ylkuphrtab() ? xf1.lqeggnwhkg.proloyalty_specific_order_edit_order_continue : xf1.lqeggnwhkg.proloyalty_specific_order_edit_order));
        binding.f124692gtknphoqwx.setEnabled(model.eablkybsjg());
        iozdgvuglv(binding, model.kcexrzcfyt(), model.jpowsppfya());
        jyumaefscl(binding, model.dsvhmnatus());
        kcexrzcfyt(binding, model.iozdgvuglv());
        zdlpuopuiu(binding, model.pkzmftpjix());
        yggfygwlhe(binding, model.hkdspvbjdz());
        binding.f124725yggfygwlhe.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1188896284, true, new vdvldrhtss(model)));
        boolean zIsEmpty = model.cqumvgiudr().isEmpty();
        MaterialTextView tvRemovedOrderList = binding.f124708ntlheqmsrt;
        zdlpuopuiu.dxjokdxxww(tvRemovedOrderList, "tvRemovedOrderList");
        tvRemovedOrderList.setVisibility(!zIsEmpty ? 0 : 8);
        ComposeView removedOrderProducts = binding.f124691esjtqupxsv;
        zdlpuopuiu.dxjokdxxww(removedOrderProducts, "removedOrderProducts");
        removedOrderProducts.setVisibility(!zIsEmpty ? 0 : 8);
        if (!zIsEmpty) {
            binding.f124691esjtqupxsv.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(483269184, true, new oxmwwwfdhm(model)));
        }
        oxmwwwfdhm().wkgbmnqykc(model.lereixgezr());
        boolean zZfvoamnweg = kcexrzcfyt.zfvoamnweg(model.zdlpuopuiu());
        MaterialTextView tvPostamatCodeTitle = binding.f124716stevsuqkhv;
        zdlpuopuiu.dxjokdxxww(tvPostamatCodeTitle, "tvPostamatCodeTitle");
        tvPostamatCodeTitle.setVisibility(!zZfvoamnweg ? 0 : 8);
        MaterialTextView tvPostamatCodeValue = binding.f124703kegysxyocb;
        zdlpuopuiu.dxjokdxxww(tvPostamatCodeValue, "tvPostamatCodeValue");
        tvPostamatCodeValue.setVisibility(!zZfvoamnweg ? 0 : 8);
        AppCompatImageView ivPostamatQrCode = binding.f124711oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ivPostamatQrCode, "ivPostamatQrCode");
        ivPostamatQrCode.setVisibility(!zZfvoamnweg ? 0 : 8);
        binding.f124703kegysxyocb.setText(model.zdlpuopuiu());
        AppCompatImageView ivPostamatQrCode2 = binding.f124711oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ivPostamatQrCode2, "ivPostamatQrCode");
        lmojexxdyd(ivPostamatQrCode2, model.zdlpuopuiu());
        binding.f124698istkbnxepw.setRefreshing(model.lmojexxdyd());
        MaterialButton btnTipsOrder = binding.f124687draadjrbmk;
        zdlpuopuiu.dxjokdxxww(btnTipsOrder, "btnTipsOrder");
        btnTipsOrder.setVisibility(model.zynmafqrjb() ? 0 : 8);
        binding.f124683btonecajqb.setEnabled(!model.lmojexxdyd());
        MaterialButton btnRepeatOrder = binding.f124683btonecajqb;
        zdlpuopuiu.dxjokdxxww(btnRepeatOrder, "btnRepeatOrder");
        btnRepeatOrder.setVisibility(model.esjtqupxsv() ? 0 : 8);
        if (model.esjtqupxsv()) {
            MaterialButton materialButton = binding.f124683btonecajqb;
            if (!model.zynmafqrjb()) {
                zdlpuopuiu.lqeggnwhkg(materialButton);
                p41.nufgyqmvbu.zoijcleaow(materialButton, b31.wkgbmnqykc.csl_primary);
                materialButton.setTextColor(androidx.core.content.iobyxmoadg.getColor(materialButton.getContext(), b31.wkgbmnqykc.csl_text_static_white));
            } else {
                zdlpuopuiu.lqeggnwhkg(materialButton);
                p41.nufgyqmvbu.zoijcleaow(materialButton, b31.wkgbmnqykc.transparent);
                materialButton.setStrokeColorResource(b31.wkgbmnqykc.csl_primary);
                materialButton.setTextColor(androidx.core.content.iobyxmoadg.getColor(materialButton.getContext(), b31.wkgbmnqykc.csl_primary));
                materialButton.setStrokeWidthResource(b31.eablkybsjg.content_margin_2);
            }
        }
    }
}
