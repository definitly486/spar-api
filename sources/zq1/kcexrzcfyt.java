package zq1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kcexrzcfyt {

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
            return Boolean.valueOf(obj instanceof yr1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f130982zdlpuopuiu = new zoijcleaow();

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

    private static final void agtfadlqog(uq1.lqeggnwhkg lqeggnwhkgVar, ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof yq1.zoijcleaow.wkgbmnqykc) {
                    lqeggnwhkgVar.f114187zoijcleaow.ulzqkzuiru((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof yq1.zoijcleaow.ppxfxbqfkf) {
                    lqeggnwhkgVar.f114187zoijcleaow.mbcevpiqjq((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof yq1.zoijcleaow.iobyxmoadg) {
                    lqeggnwhkgVar.f114187zoijcleaow.tzroggbefp((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof yq1.zoijcleaow.C3220zoijcleaow) {
                    lqeggnwhkgVar.f114187zoijcleaow.kegysxyocb((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof yq1.zoijcleaow.gxszxtbevo) {
                    lqeggnwhkgVar.f114187zoijcleaow.ntlheqmsrt((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq1.lqeggnwhkg draadjrbmk(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = uq1.lqeggnwhkg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lqeggnwhkgVarPpxfxbqfkf, "inflate(...)");
        return lqeggnwhkgVarPpxfxbqfkf;
    }

    public static final df.zoijcleaow gtknphoqwx(final tg.draadjrbmk onAttachCheckClicked, final tg.draadjrbmk onDeleteCheckClicked, final tg.rgvfuqvkyq onFormChanged, final tg.draadjrbmk onFormSendClicked, final tg.iobyxmoadg onViewTermsClicked, final tg.draadjrbmk onReceiptDateClicked, final tg.draadjrbmk onReceiptDateClearClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAttachCheckClicked, "onAttachCheckClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteCheckClicked, "onDeleteCheckClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFormChanged, "onFormChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFormSendClicked, "onFormSendClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onViewTermsClicked, "onViewTermsClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onReceiptDateClicked, "onReceiptDateClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onReceiptDateClearClicked, "onReceiptDateClearClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: zq1.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.draadjrbmk((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: zq1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.wflxmlrfwp(onFormSendClicked, onAttachCheckClicked, onDeleteCheckClicked, onViewTermsClicked, onFormChanged, onReceiptDateClicked, onReceiptDateClearClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f130982zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jyumaefscl(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn oxmwwwfdhm(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(uq1.lqeggnwhkg lqeggnwhkgVar, ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            lqeggnwhkgVar.f114187zoijcleaow.setData((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        } else {
            agtfadlqog(lqeggnwhkgVar, iobyxmoadgVar, payloads);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(final tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2, final tg.draadjrbmk draadjrbmkVar3, final tg.iobyxmoadg iobyxmoadgVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.draadjrbmk draadjrbmkVar4, final tg.draadjrbmk draadjrbmkVar5, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.lqeggnwhkg lqeggnwhkgVar = (uq1.lqeggnwhkg) adapterDelegateViewBinding.ppxfxbqfkf();
        lqeggnwhkgVar.f114187zoijcleaow.setSendClickListener(new tg.iobyxmoadg() { // from class: zq1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.ojitshcjhn(draadjrbmkVar, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setAttachCheckListener(new tg.iobyxmoadg() { // from class: zq1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.vdvldrhtss(draadjrbmkVar2, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setDeleteCheckListener(new tg.iobyxmoadg() { // from class: zq1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.oxmwwwfdhm(draadjrbmkVar3, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setViewTermsListener(new tg.iobyxmoadg() { // from class: zq1.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.kcexrzcfyt(iobyxmoadgVar);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setFormChangedListener(new tg.draadjrbmk() { // from class: zq1.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.zdlpuopuiu(rgvfuqvkyqVar, adapterDelegateViewBinding, (RegistrationFormView.zoijcleaow) obj);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setReceiptDateClickedListener(new tg.iobyxmoadg() { // from class: zq1.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.yggfygwlhe(draadjrbmkVar4, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f114187zoijcleaow.setReceiptDateClearClickListener(new tg.iobyxmoadg() { // from class: zq1.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.jyumaefscl(draadjrbmkVar5, adapterDelegateViewBinding);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: zq1.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.rgvfuqvkyq(lqeggnwhkgVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zdlpuopuiu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, RegistrationFormView.zoijcleaow change) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
        rgvfuqvkyqVar.invoke(((yr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId(), change);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
