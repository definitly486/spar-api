package c91;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb extends tr0.iobyxmoadg implements d8.zoijcleaow {

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f19348jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f19349yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19350zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f19350zdlpuopuiu = jpowsppfyaVar;
            this.f19349yggfygwlhe = j13;
            this.f19348jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f19350zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f19349yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f19348jyumaefscl.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f19361iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f19351jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f19352yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19353zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f19353zdlpuopuiu = jpowsppfyaVar;
            this.f19352yggfygwlhe = j13;
            this.f19351jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f19353zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f19352yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f19351jyumaefscl.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f19359iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ btonecajqb f19354jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f19355yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19356zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, btonecajqb btonecajqbVar) {
            this.f19356zdlpuopuiu = jpowsppfyaVar;
            this.f19355yggfygwlhe = j13;
            this.f19354jyumaefscl = btonecajqbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f19356zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f19355yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f19354jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f19360iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        z41.gxszxtbevo gxszxtbevoVar = (z41.gxszxtbevo) binding.invoke();
        AppCompatImageView btnClose = gxszxtbevoVar.f128041ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnClose, "btnClose");
        btnClose.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        MaterialTextView tvReadAgreements = gxszxtbevoVar.f128040nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(tvReadAgreements, "tvReadAgreements");
        tvReadAgreements.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        MaterialButton btnApply = gxszxtbevoVar.f128043zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnApply, "btnApply");
        btnApply.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(z41.gxszxtbevo binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
    }
}
