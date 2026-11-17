package androidx.fragment.app;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
public abstract class stevsuqkhv {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f9347zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Fragment fragment) {
            super(0);
            this.f9347zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            return this.f9347zdlpuopuiu.getDefaultViewModelProviderFactory();
        }
    }

    public static final /* synthetic */ ribwqtqdhb iobyxmoadg(gg.gtknphoqwx gtknphoqwxVar) {
        return ppxfxbqfkf(gtknphoqwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ribwqtqdhb ppxfxbqfkf(gg.gtknphoqwx gtknphoqwxVar) {
        return (ribwqtqdhb) gtknphoqwxVar.getValue();
    }

    public static final gg.gtknphoqwx zoijcleaow(Fragment fragment, ah.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3) {
        if (iobyxmoadgVar3 == null) {
            iobyxmoadgVar3 = new iobyxmoadg(fragment);
        }
        return new androidx.lifecycle.sopmlzcsov(wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar3, iobyxmoadgVar2);
    }
}
