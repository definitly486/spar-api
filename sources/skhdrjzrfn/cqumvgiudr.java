package skhdrjzrfn;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.runtime.c1;
import j0.m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr implements oxmwwwfdhm {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private TextClassifier f107357gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lg.btonecajqb f107358iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hcddaimhww f107361ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r0.eablkybsjg f107362wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f107363zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yj.iobyxmoadg f107356eablkybsjg = yj.lqeggnwhkg.zoijcleaow(false, 1, null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f107359lqeggnwhkg = c1.ppxfxbqfkf(null, null, 2, null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Object f107360nufgyqmvbu = new Object();

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f107364cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        long f107366iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107367jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f107368lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107369yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107370zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107364cqumvgiudr = obj;
            this.f107368lereixgezr |= Integer.MIN_VALUE;
            return cqumvgiudr.this.draadjrbmk(null, 0L, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107371cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107373jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107374yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107375zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f107376jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ TextClassifier f107377yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f107378zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(TextClassifier textClassifier, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107377yggfygwlhe = textClassifier;
                this.f107376jyumaefscl = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f107377yggfygwlhe, this.f107376jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f107378zdlpuopuiu;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    return obj;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                TextClassifier textClassifier = this.f107377yggfygwlhe;
                if (textClassifier == null) {
                    return null;
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f107376jyumaefscl;
                this.f107378zdlpuopuiu = 1;
                Object objInvoke = rgvfuqvkyqVar.invoke(textClassifier, this);
                return objInvoke == objGxszxtbevo ? objGxszxtbevo : objInvoke;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ cqumvgiudr f107379yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f107380zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107379yggfygwlhe = cqumvgiudrVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f107379yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f107380zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                TextClassifier textClassifierIobyxmoadg = uawqvzlxes.f107621iobyxmoadg.iobyxmoadg(this.f107379yggfygwlhe.f107363zoijcleaow, this.f107379yggfygwlhe.f107361ppxfxbqfkf);
                this.f107379yggfygwlhe.f107357gxszxtbevo = textClassifierIobyxmoadg;
                return textClassifierIobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107371cqumvgiudr = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return cqumvgiudr.this.new ppxfxbqfkf(this.f107371cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0094 A[PHI: r10
          0x0094: PHI (r10v13 java.lang.Object) = (r10v10 java.lang.Object), (r10v0 java.lang.Object) binds: [B:33:0x0091, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            yj.iobyxmoadg iobyxmoadgVar;
            cqumvgiudr cqumvgiudrVar;
            yj.iobyxmoadg iobyxmoadgVar2;
            Throwable th2;
            TextClassifier textClassifier;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107373jyumaefscl;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = cqumvgiudr.this.f107356eablkybsjg;
                    cqumvgiudrVar = cqumvgiudr.this;
                    this.f107375zdlpuopuiu = iobyxmoadgVar;
                    this.f107374yggfygwlhe = cqumvgiudrVar;
                    this.f107373jyumaefscl = 1;
                    if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            iobyxmoadgVar2 = (yj.iobyxmoadg) this.f107375zdlpuopuiu;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                textClassifier = (TextClassifier) obj;
                                iobyxmoadgVar = iobyxmoadgVar2;
                                iobyxmoadgVar.eablkybsjg(null);
                                iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(textClassifier, this.f107371cqumvgiudr, null);
                                this.f107375zdlpuopuiu = null;
                                this.f107374yggfygwlhe = null;
                                this.f107373jyumaefscl = 3;
                                obj = pj.f.wkgbmnqykc(200L, iobyxmoadgVar3, this);
                                if (obj == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                iobyxmoadgVar2.eablkybsjg(null);
                                throw th2;
                            }
                        } else {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gg.zdlpuopuiu.zoijcleaow(obj);
                        }
                        return obj;
                    }
                    cqumvgiudrVar = (cqumvgiudr) this.f107374yggfygwlhe;
                    yj.iobyxmoadg iobyxmoadgVar4 = (yj.iobyxmoadg) this.f107375zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = iobyxmoadgVar4;
                }
                textClassifier = cqumvgiudrVar.f107357gxszxtbevo;
                if (textClassifier != null) {
                    if (textClassifier.isDestroyed()) {
                    }
                    iobyxmoadgVar.eablkybsjg(null);
                    iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(textClassifier, this.f107371cqumvgiudr, null);
                    this.f107375zdlpuopuiu = null;
                    this.f107374yggfygwlhe = null;
                    this.f107373jyumaefscl = 3;
                    obj = pj.f.wkgbmnqykc(200L, iobyxmoadgVar5, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return obj;
                }
                zoijcleaow zoijcleaowVar = new zoijcleaow(cqumvgiudrVar, null);
                this.f107375zdlpuopuiu = iobyxmoadgVar;
                this.f107374yggfygwlhe = null;
                this.f107373jyumaefscl = 2;
                Object objWkgbmnqykc = pj.f.wkgbmnqykc(300L, zoijcleaowVar, this);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                obj = objWkgbmnqykc;
                textClassifier = (TextClassifier) obj;
                iobyxmoadgVar = iobyxmoadgVar2;
                iobyxmoadgVar.eablkybsjg(null);
                iobyxmoadg iobyxmoadgVar6 = new iobyxmoadg(textClassifier, this.f107371cqumvgiudr, null);
                this.f107375zdlpuopuiu = null;
                this.f107374yggfygwlhe = null;
                this.f107373jyumaefscl = 3;
                obj = pj.f.wkgbmnqykc(200L, iobyxmoadgVar6, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return obj;
            } catch (Throwable th4) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                th2 = th4;
                iobyxmoadgVar2.eablkybsjg(null);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f107381cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private /* synthetic */ Object f107382esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        long f107383iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107384jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ CharSequence f107385lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ long f107386pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107387yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107388zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f107389zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(CharSequence charSequence, long j13, cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107385lereixgezr = charSequence;
            this.f107386pmvmpeiblj = j13;
            this.f107389zynmafqrjb = cqumvgiudrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f107385lereixgezr, this.f107386pmvmpeiblj, this.f107389zynmafqrjb, gxszxtbevoVar);
            wkgbmnqykcVar.f107382esjtqupxsv = obj;
            return wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            long j13;
            yj.iobyxmoadg iobyxmoadgVar;
            cqumvgiudr cqumvgiudrVar;
            CharSequence charSequence;
            TextSelection textSelection;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107381cqumvgiudr;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                TextClassifier textClassifier = (TextClassifier) this.f107382esjtqupxsv;
                pmvmpeiblj.iobyxmoadg();
                TextSelection.Request.Builder defaultLocales = lereixgezr.iobyxmoadg(this.f107385lereixgezr, j0.l.draadjrbmk(this.f107386pmvmpeiblj), j0.l.gtknphoqwx(this.f107386pmvmpeiblj)).setDefaultLocales(this.f107389zynmafqrjb.wflxmlrfwp());
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 31) {
                    defaultLocales.setIncludeTextClassification(true);
                }
                TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                long jZoijcleaow = m.zoijcleaow(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                if (i14 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                    cqumvgiudr cqumvgiudrVar2 = this.f107389zynmafqrjb;
                    CharSequence charSequence2 = this.f107385lereixgezr;
                    this.f107383iwizpuwonk = jZoijcleaow;
                    this.f107381cqumvgiudr = 2;
                    if (cqumvgiudrVar2.draadjrbmk(charSequence2, jZoijcleaow, textClassifier, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    j13 = jZoijcleaow;
                } else {
                    iobyxmoadgVar = this.f107389zynmafqrjb.f107356eablkybsjg;
                    cqumvgiudr cqumvgiudrVar3 = this.f107389zynmafqrjb;
                    CharSequence charSequence3 = this.f107385lereixgezr;
                    this.f107382esjtqupxsv = textSelectionSuggestSelection;
                    this.f107388zdlpuopuiu = iobyxmoadgVar;
                    this.f107387yggfygwlhe = cqumvgiudrVar3;
                    this.f107384jyumaefscl = charSequence3;
                    this.f107383iwizpuwonk = jZoijcleaow;
                    this.f107381cqumvgiudr = 1;
                    if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    cqumvgiudrVar = cqumvgiudrVar3;
                    charSequence = charSequence3;
                    textSelection = textSelectionSuggestSelection;
                    j13 = jZoijcleaow;
                    TextClassification textClassification = textSelection.getTextClassification();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(textClassification);
                    cqumvgiudrVar.rgvfuqvkyq(new lrnfpwlwnk(charSequence, j13, textClassification, null));
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else if (i13 == 1) {
                j13 = this.f107383iwizpuwonk;
                CharSequence charSequence4 = (CharSequence) this.f107384jyumaefscl;
                cqumvgiudrVar = (cqumvgiudr) this.f107387yggfygwlhe;
                iobyxmoadgVar = (yj.iobyxmoadg) this.f107388zdlpuopuiu;
                textSelection = (TextSelection) this.f107382esjtqupxsv;
                gg.zdlpuopuiu.zoijcleaow(obj);
                charSequence = charSequence4;
                try {
                    TextClassification textClassification2 = textSelection.getTextClassification();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(textClassification2);
                    cqumvgiudrVar.rgvfuqvkyq(new lrnfpwlwnk(charSequence, j13, textClassification2, null));
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                } finally {
                    iobyxmoadgVar.eablkybsjg(null);
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = this.f107383iwizpuwonk;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return j0.l.zoijcleaow(j13);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(textClassifier, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f107390cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ CharSequence f107391iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f107393yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107394zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(CharSequence charSequence, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107391iwizpuwonk = charSequence;
            this.f107390cqumvgiudr = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = cqumvgiudr.this.new zoijcleaow(this.f107391iwizpuwonk, this.f107390cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f107393yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107394zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                TextClassifier textClassifier = (TextClassifier) this.f107393yggfygwlhe;
                cqumvgiudr cqumvgiudrVar = cqumvgiudr.this;
                CharSequence charSequence = this.f107391iwizpuwonk;
                long j13 = this.f107390cqumvgiudr;
                this.f107394zdlpuopuiu = 1;
                if (cqumvgiudrVar.draadjrbmk(charSequence, j13, textClassifier, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TextClassifier textClassifier, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(textClassifier, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public cqumvgiudr(lg.btonecajqb btonecajqbVar, Context context, hcddaimhww hcddaimhwwVar, r0.eablkybsjg eablkybsjgVar) {
        this.f107358iobyxmoadg = btonecajqbVar;
        this.f107363zoijcleaow = context;
        this.f107361ppxfxbqfkf = hcddaimhwwVar;
        this.f107362wkgbmnqykc = eablkybsjgVar;
    }

    private final lrnfpwlwnk agtfadlqog() {
        return (lrnfpwlwnk) this.f107359lqeggnwhkg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object draadjrbmk(CharSequence charSequence, long j13, TextClassifier textClassifier, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        long j14;
        yj.iobyxmoadg iobyxmoadgVar3;
        TextClassification textClassification;
        long j15;
        CharSequence charSequence3;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f107368lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f107368lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f107364cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f107368lereixgezr;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    j14 = iobyxmoadgVar.f107366iwizpuwonk;
                    iobyxmoadgVar2 = (yj.iobyxmoadg) iobyxmoadgVar.f107367jyumaefscl;
                    textClassifier2 = (TextClassifier) iobyxmoadgVar.f107369yggfygwlhe;
                    charSequence2 = (CharSequence) iobyxmoadgVar.f107370zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j16 = iobyxmoadgVar.f107366iwizpuwonk;
                    iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f107367jyumaefscl;
                    TextClassification textClassification2 = (TextClassification) iobyxmoadgVar.f107369yggfygwlhe;
                    CharSequence charSequence4 = (CharSequence) iobyxmoadgVar.f107370zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    charSequence3 = charSequence4;
                    j15 = j16;
                    textClassification = textClassification2;
                }
                try {
                    rgvfuqvkyq(new lrnfpwlwnk(charSequence3, j15, textClassification, null));
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } finally {
                    iobyxmoadgVar3.eablkybsjg(null);
                }
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = this.f107356eablkybsjg;
            iobyxmoadgVar.f107370zdlpuopuiu = charSequence;
            iobyxmoadgVar.f107369yggfygwlhe = textClassifier;
            iobyxmoadgVar.f107367jyumaefscl = iobyxmoadgVar2;
            iobyxmoadgVar.f107366iwizpuwonk = j13;
            iobyxmoadgVar.f107368lereixgezr = 1;
            if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            j14 = j13;
            lrnfpwlwnk lrnfpwlwnkVarAgtfadlqog = agtfadlqog();
            if (lrnfpwlwnkVarAgtfadlqog != null && ylkuphrtab.lqeggnwhkg(lrnfpwlwnkVarAgtfadlqog, charSequence2, j14)) {
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar2.eablkybsjg(null);
                return wwaezpbzknVar2;
            }
            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar2.eablkybsjg(null);
            zdlpuopuiu.iobyxmoadg();
            TextClassification textClassificationClassifyText = textClassifier2.classifyText(kcexrzcfyt.iobyxmoadg(charSequence2, j0.l.draadjrbmk(j14), j0.l.gtknphoqwx(j14)).setDefaultLocales(wflxmlrfwp()).build());
            yj.iobyxmoadg iobyxmoadgVar4 = this.f107356eablkybsjg;
            iobyxmoadgVar.f107370zdlpuopuiu = charSequence2;
            iobyxmoadgVar.f107369yggfygwlhe = textClassificationClassifyText;
            iobyxmoadgVar.f107367jyumaefscl = iobyxmoadgVar4;
            iobyxmoadgVar.f107366iwizpuwonk = j14;
            iobyxmoadgVar.f107368lereixgezr = 2;
            if (iobyxmoadgVar4.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar4;
            textClassification = textClassificationClassifyText;
            j15 = j14;
            charSequence3 = charSequence2;
            rgvfuqvkyq(new lrnfpwlwnk(charSequence3, j15, textClassification, null));
            gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            iobyxmoadgVar2.eablkybsjg(null);
            throw th2;
        }
    }

    private final Object ojitshcjhn(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dxjokdxxww.lqeggnwhkg(this.f107358iobyxmoadg, new ppxfxbqfkf(rgvfuqvkyqVar, null), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rgvfuqvkyq(lrnfpwlwnk lrnfpwlwnkVar) {
        this.f107359lqeggnwhkg.setValue(lrnfpwlwnkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocaleList wflxmlrfwp() {
        LocaleList localeListPpxfxbqfkf;
        r0.eablkybsjg eablkybsjgVar = this.f107362wkgbmnqykc;
        return (eablkybsjgVar == null || (localeListPpxfxbqfkf = uawqvzlxes.f107621iobyxmoadg.ppxfxbqfkf(eablkybsjgVar)) == null) ? new LocaleList(r0.wkgbmnqykc.f81334zoijcleaow.iobyxmoadg().iobyxmoadg()) : localeListPpxfxbqfkf;
    }

    public final void gtknphoqwx(weqkydbzbr.iobyxmoadg iobyxmoadgVar, CharSequence charSequence, long j13, tg.draadjrbmk draadjrbmkVar) {
        TextClassification textClassificationVdvldrhtss = vdvldrhtss(charSequence, j13);
        if (textClassificationVdvldrhtss == null) {
            draadjrbmkVar.invoke(iobyxmoadgVar);
            return;
        }
        if (!textClassificationVdvldrhtss.getActions().isEmpty()) {
            weqkydbzbr.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar, this.f107360nufgyqmvbu, textClassificationVdvldrhtss, 0);
        } else if (uawqvzlxes.f107621iobyxmoadg.zoijcleaow(textClassificationVdvldrhtss)) {
            weqkydbzbr.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar, this.f107360nufgyqmvbu, textClassificationVdvldrhtss, -1);
        }
        draadjrbmkVar.invoke(iobyxmoadgVar);
        List actions = textClassificationVdvldrhtss.getActions();
        int size = actions.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 > 0) {
                weqkydbzbr.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar, this.f107360nufgyqmvbu, textClassificationVdvldrhtss, i13);
            }
        }
    }

    @Override // skhdrjzrfn.oxmwwwfdhm
    public Object iobyxmoadg(CharSequence charSequence, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        return (charSequence.length() == 0 || j0.l.nufgyqmvbu(j13)) ? gg.wwaezpbzkn.f37140iobyxmoadg : ojitshcjhn(new zoijcleaow(charSequence, j13, null), gxszxtbevoVar);
    }

    public final TextClassification vdvldrhtss(CharSequence charSequence, long j13) {
        if (!yj.iobyxmoadg.C3196iobyxmoadg.zoijcleaow(this.f107356eablkybsjg, null, 1, null)) {
            return null;
        }
        lrnfpwlwnk lrnfpwlwnkVarAgtfadlqog = agtfadlqog();
        TextClassification textClassificationPpxfxbqfkf = (lrnfpwlwnkVarAgtfadlqog == null || !ylkuphrtab.lqeggnwhkg(lrnfpwlwnkVarAgtfadlqog, charSequence, j13)) ? null : lrnfpwlwnkVarAgtfadlqog.ppxfxbqfkf();
        yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(this.f107356eablkybsjg, null, 1, null);
        return textClassificationPpxfxbqfkf;
    }

    @Override // skhdrjzrfn.oxmwwwfdhm
    public Object zoijcleaow(CharSequence charSequence, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        if (charSequence.length() == 0 || j0.l.nufgyqmvbu(j13)) {
            return null;
        }
        return ojitshcjhn(new wkgbmnqykc(charSequence, j13, this, null), gxszxtbevoVar);
    }
}
