package g52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;

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
            return Boolean.valueOf(obj instanceof f62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36287zdlpuopuiu = new zoijcleaow();

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

    private static final void agtfadlqog(b52.lqeggnwhkg lqeggnwhkgVar, ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof f52.zoijcleaow.wkgbmnqykc) {
                    lqeggnwhkgVar.f15325zoijcleaow.ulzqkzuiru((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof f52.zoijcleaow.ppxfxbqfkf) {
                    lqeggnwhkgVar.f15325zoijcleaow.mbcevpiqjq((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof f52.zoijcleaow.iobyxmoadg) {
                    lqeggnwhkgVar.f15325zoijcleaow.tzroggbefp((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof f52.zoijcleaow.C0718zoijcleaow) {
                    lqeggnwhkgVar.f15325zoijcleaow.kegysxyocb((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
                if (obj2 instanceof f52.zoijcleaow.gxszxtbevo) {
                    lqeggnwhkgVar.f15325zoijcleaow.ntlheqmsrt((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b52.lqeggnwhkg draadjrbmk(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = b52.lqeggnwhkg.ppxfxbqfkf(layoutInflater, root, false);
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
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.draadjrbmk((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.wflxmlrfwp(onFormSendClicked, onAttachCheckClicked, onDeleteCheckClicked, onViewTermsClicked, onFormChanged, onReceiptDateClicked, onReceiptDateClearClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36287zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jyumaefscl(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
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
        draadjrbmkVar.invoke(((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(b52.lqeggnwhkg lqeggnwhkgVar, ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            lqeggnwhkgVar.f15325zoijcleaow.setData((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        } else {
            agtfadlqog(lqeggnwhkgVar, iobyxmoadgVar, payloads);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(final tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2, final tg.draadjrbmk draadjrbmkVar3, final tg.iobyxmoadg iobyxmoadgVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.draadjrbmk draadjrbmkVar4, final tg.draadjrbmk draadjrbmkVar5, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.lqeggnwhkg lqeggnwhkgVar = (b52.lqeggnwhkg) adapterDelegateViewBinding.ppxfxbqfkf();
        lqeggnwhkgVar.f15325zoijcleaow.setSendClickListener(new tg.iobyxmoadg() { // from class: g52.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.ojitshcjhn(draadjrbmkVar, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setAttachCheckListener(new tg.iobyxmoadg() { // from class: g52.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.vdvldrhtss(draadjrbmkVar2, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setDeleteCheckListener(new tg.iobyxmoadg() { // from class: g52.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.oxmwwwfdhm(draadjrbmkVar3, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setViewTermsListener(new tg.iobyxmoadg() { // from class: g52.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.kcexrzcfyt(iobyxmoadgVar);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setFormChangedListener(new tg.draadjrbmk() { // from class: g52.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.zdlpuopuiu(rgvfuqvkyqVar, adapterDelegateViewBinding, (RegistrationFormView.zoijcleaow) obj);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setReceiptDateClickedListener(new tg.iobyxmoadg() { // from class: g52.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.yggfygwlhe(draadjrbmkVar4, adapterDelegateViewBinding);
            }
        });
        lqeggnwhkgVar.f15325zoijcleaow.setReceiptDateClearClickListener(new tg.iobyxmoadg() { // from class: g52.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.jyumaefscl(draadjrbmkVar5, adapterDelegateViewBinding);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.rgvfuqvkyq(lqeggnwhkgVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zdlpuopuiu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, RegistrationFormView.zoijcleaow change) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
        rgvfuqvkyqVar.invoke(((f62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId(), change);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
