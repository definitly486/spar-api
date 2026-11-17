package db0;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb extends zs.iobyxmoadg implements d8.zoijcleaow {

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f27378jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27379yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f27380zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f27380zdlpuopuiu = jpowsppfyaVar;
            this.f27379yggfygwlhe = j13;
            this.f27378jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f27380zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27379yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f27378jyumaefscl.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f27391iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f27381jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27382yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f27383zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f27383zdlpuopuiu = jpowsppfyaVar;
            this.f27382yggfygwlhe = j13;
            this.f27381jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f27383zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27382yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f27381jyumaefscl.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f27389iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f27384jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27385yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f27386zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f27386zdlpuopuiu = jpowsppfyaVar;
            this.f27385yggfygwlhe = j13;
            this.f27384jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f27386zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27385yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f27384jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f27390iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        m60.dxjokdxxww dxjokdxxwwVar = (m60.dxjokdxxww) binding.invoke();
        AppCompatImageView btnClose = dxjokdxxwwVar.f65471ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnClose, "btnClose");
        btnClose.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        MaterialTextView tvReadAgreements = dxjokdxxwwVar.f65470nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(tvReadAgreements, "tvReadAgreements");
        tvReadAgreements.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        MaterialButton btnApply = dxjokdxxwwVar.f65473zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnApply, "btnApply");
        btnApply.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m60.dxjokdxxww binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
    }
}
