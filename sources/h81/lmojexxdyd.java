package h81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lmojexxdyd {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof yggfygwlhe.gxszxtbevo);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39867zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c81.lqeggnwhkg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        c81.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = c81.lqeggnwhkg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lqeggnwhkgVarPpxfxbqfkf, "inflate(...)");
        return lqeggnwhkgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final ac1.ppxfxbqfkf ppxfxbqfkfVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h81.iozdgvuglv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lmojexxdyd.lqeggnwhkg(adapterDelegateViewBinding, ppxfxbqfkfVar, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, ac1.ppxfxbqfkf ppxfxbqfkfVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((c81.lqeggnwhkg) iobyxmoadgVar.ppxfxbqfkf()).f19240zoijcleaow.setImageBitmap(ppxfxbqfkfVar.iobyxmoadg(((yggfygwlhe.gxszxtbevo) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), androidx.core.content.iobyxmoadg.getColor(iobyxmoadgVar.wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(iobyxmoadgVar.wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_space), UserVerificationMethods.USER_VERIFY_NONE, 0));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final ac1.ppxfxbqfkf imageUtils) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h81.cdpycssgdh
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lmojexxdyd.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h81.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lmojexxdyd.gxszxtbevo(imageUtils, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39867zdlpuopuiu);
    }
}
