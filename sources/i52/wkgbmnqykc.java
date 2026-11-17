package i52;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.bonus_card.CardWidget;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof a62.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f41977iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f41978jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f41979yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f41980zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
            this.f41980zdlpuopuiu = jpowsppfyaVar;
            this.f41979yggfygwlhe = j13;
            this.f41978jyumaefscl = iobyxmoadgVar;
            this.f41977iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f41980zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f41979yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f41978jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f41977iwizpuwonk.invoke();
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f41981zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.iobyxmoadg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        m60.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = m60.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final m60.iobyxmoadg iobyxmoadgVar2 = (m60.iobyxmoadg) adapterDelegateViewBinding.ppxfxbqfkf();
        CardWidget root = iobyxmoadgVar2.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, iobyxmoadgVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: i52.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(iobyxmoadgVar2, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(m60.iobyxmoadg iobyxmoadgVar, ef.iobyxmoadg iobyxmoadgVar2, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        iobyxmoadgVar.f65578zoijcleaow.iobyxmoadg((int) ((a62.iobyxmoadg) iobyxmoadgVar2.eablkybsjg()).iobyxmoadg(), ((a62.iobyxmoadg) iobyxmoadgVar2.eablkybsjg()).wkgbmnqykc());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.iobyxmoadg onBonusCardClick) {
        zdlpuopuiu.btonecajqb(onBonusCardClick, "onBonusCardClick");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: i52.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: i52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(onBonusCardClick, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f41981zdlpuopuiu);
    }
}
