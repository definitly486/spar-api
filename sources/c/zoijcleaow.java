package c;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.dsvhmnatus;
import androidx.collection.iozdgvuglv;
import androidx.collection.ojitshcjhn;
import androidx.collection.rgvfuqvkyq;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.k;
import androidx.lifecycle.vdvldrhtss;
import g0.cdpycssgdh;
import g0.cqumvgiudr;
import g0.esjtqupxsv;
import g0.zdlpuopuiu;
import gg.wwaezpbzkn;
import j0.e;
import j0.f;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jyumaefscl;
import z.opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements agtfadlqog, androidx.lifecycle.gxszxtbevo, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f17812cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private j f17815iozdgvuglv;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private c0.ppxfxbqfkf f17818jyumaefscl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f17820lmojexxdyd;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private tg.iobyxmoadg f17824yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final AndroidComposeView f17825zdlpuopuiu;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final iobyxmoadg f17811ylkuphrtab = new iobyxmoadg(null);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final int f17810pkzmftpjix = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f17817iwizpuwonk = new ArrayList();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private long f17813cqumvgiudr = 100;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private EnumC0324zoijcleaow f17814esjtqupxsv = EnumC0324zoijcleaow.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f17819lereixgezr = true;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final rj.lqeggnwhkg f17821pmvmpeiblj = rj.btonecajqb.zoijcleaow(1, null, null, 6, null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Handler f17826zynmafqrjb = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ojitshcjhn f17816istkbnxepw = rgvfuqvkyq.zoijcleaow();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private iozdgvuglv f17823yadqdtsiqt = rgvfuqvkyq.ppxfxbqfkf();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Runnable f17822wwaezpbzkn = new Runnable() { // from class: c.iobyxmoadg
        @Override // java.lang.Runnable
        public final void run() {
            zoijcleaow.draadjrbmk(this.f17805zdlpuopuiu);
        }
    };

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17827iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17829yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17830zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17829yggfygwlhe = obj;
            this.f17827iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.wkgbmnqykc(this);
        }
    }

    static final class gxszxtbevo extends jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f17831yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ j f17832zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(j jVar, zoijcleaow zoijcleaowVar) {
            super(2);
            this.f17832zdlpuopuiu = jVar;
            this.f17831yggfygwlhe = zoijcleaowVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg(((Number) obj).intValue(), (zdlpuopuiu) obj2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, zdlpuopuiu zdlpuopuiuVar) {
            if (this.f17832zdlpuopuiu.iobyxmoadg().iobyxmoadg(zdlpuopuiuVar.vdvldrhtss())) {
                return;
            }
            this.f17831yggfygwlhe.lmojexxdyd(i13, zdlpuopuiuVar);
            this.f17831yggfygwlhe.kcexrzcfyt();
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends jyumaefscl implements tg.rgvfuqvkyq {
        lqeggnwhkg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg(((Number) obj).intValue(), (zdlpuopuiu) obj2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, zdlpuopuiu zdlpuopuiuVar) {
            zoijcleaow.this.lmojexxdyd(i13, zdlpuopuiuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f17834iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void eablkybsjg(zoijcleaow zoijcleaowVar, LongSparseArray longSparseArray) {
            f17834iobyxmoadg.zoijcleaow(zoijcleaowVar, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void zoijcleaow(zoijcleaow zoijcleaowVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            g0.jyumaefscl jyumaefsclVar;
            zdlpuopuiu zdlpuopuiuVarZoijcleaow;
            g0.iobyxmoadg iobyxmoadgVar;
            tg.draadjrbmk draadjrbmkVar;
            int size = longSparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                long jKeyAt = longSparseArray.keyAt(i13);
                ViewTranslationResponse viewTranslationResponseIobyxmoadg = nufgyqmvbu.iobyxmoadg(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseIobyxmoadg != null && (value = viewTranslationResponseIobyxmoadg.getValue("android:text")) != null && (text = value.getText()) != null && (jyumaefsclVar = (g0.jyumaefscl) zoijcleaowVar.agtfadlqog().zoijcleaow((int) jKeyAt)) != null && (zdlpuopuiuVarZoijcleaow = jyumaefsclVar.zoijcleaow()) != null && (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), g0.draadjrbmk.f35622iobyxmoadg.pmvmpeiblj())) != null && (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) != null) {
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x006d  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void ppxfxbqfkf(zoijcleaow zoijcleaowVar, long[] jArr, int[] iArr, Consumer consumer) {
            zdlpuopuiu zdlpuopuiuVarZoijcleaow;
            String strEablkybsjg;
            for (long j13 : jArr) {
                g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) zoijcleaowVar.agtfadlqog().zoijcleaow((int) j13);
                if (jyumaefsclVar != null && (zdlpuopuiuVarZoijcleaow = jyumaefsclVar.zoijcleaow()) != null) {
                    c.lqeggnwhkg.iobyxmoadg();
                    ViewTranslationRequest.Builder builderIobyxmoadg = c.gxszxtbevo.iobyxmoadg(zoijcleaowVar.ojitshcjhn().getAutofillId(), zdlpuopuiuVarZoijcleaow.vdvldrhtss());
                    List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsv.f35662iobyxmoadg.pkzmftpjix());
                    if (list != null && (strEablkybsjg = y0.ppxfxbqfkf.eablkybsjg(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderIobyxmoadg.setValue("android:text", TranslationRequestValue.forText(new j0.eablkybsjg(strEablkybsjg, null, 2, 0 == true ? 1 : 0)));
                        consumer.accept(builderIobyxmoadg.build());
                    }
                }
            }
        }

        public final void wkgbmnqykc(final zoijcleaow zoijcleaowVar, final LongSparseArray longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                zoijcleaow(zoijcleaowVar, longSparseArray);
            } else {
                zoijcleaowVar.ojitshcjhn().post(new Runnable() { // from class: c.gtknphoqwx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoijcleaow.ppxfxbqfkf.eablkybsjg(zoijcleaowVar, longSparseArray);
                    }
                });
            }
        }
    }

    public /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f17835iobyxmoadg;

        static {
            int[] iArr = new int[wflxmlrfwp.values().length];
            try {
                iArr[wflxmlrfwp.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wflxmlrfwp.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17835iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: c.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private enum EnumC0324zoijcleaow {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f17836iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public zoijcleaow(AndroidComposeView androidComposeView, tg.iobyxmoadg iobyxmoadgVar) {
        this.f17825zdlpuopuiu = androidComposeView;
        this.f17824yggfygwlhe = iobyxmoadgVar;
        this.f17815iozdgvuglv = new j(androidComposeView.getSemanticsOwner().wkgbmnqykc(), rgvfuqvkyq.zoijcleaow());
    }

    private final void btonecajqb(ojitshcjhn ojitshcjhnVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i13;
        char c13;
        long j13;
        int i14;
        long[] jArr3;
        Object[] objArr;
        j jVar;
        long[] jArr4;
        Object[] objArr2;
        j jVar2;
        Object[] objArr3;
        Object[] objArr4;
        ojitshcjhn ojitshcjhnVar2 = ojitshcjhnVar;
        int[] iArr3 = ojitshcjhnVar2.f4353zoijcleaow;
        long[] jArr5 = ojitshcjhnVar2.f4350iobyxmoadg;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j14 = jArr5[i15];
            char c14 = 7;
            long j15 = -9187201950435737472L;
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j14 & 255) < 128) {
                        int i19 = iArr3[(i15 << 3) + i18];
                        j jVar3 = (j) this.f17823yadqdtsiqt.zoijcleaow(i19);
                        g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) ojitshcjhnVar2.zoijcleaow(i19);
                        zdlpuopuiu zdlpuopuiuVarZoijcleaow = jyumaefsclVar != null ? jyumaefsclVar.zoijcleaow() : null;
                        if (zdlpuopuiuVarZoijcleaow == null) {
                            w.iobyxmoadg.ppxfxbqfkf("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (jVar3 == null) {
                            dsvhmnatus dsvhmnatusVarDraadjrbmk = zdlpuopuiuVarZoijcleaow.esjtqupxsv().draadjrbmk();
                            Object[] objArr5 = dsvhmnatusVarDraadjrbmk.f4302zoijcleaow;
                            long[] jArr6 = dsvhmnatusVarDraadjrbmk.f4299iobyxmoadg;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j16 = jArr6[i23];
                                    jArr2 = jArr5;
                                    i13 = length;
                                    if ((((~j16) << c14) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            if ((j16 & 255) < 128) {
                                                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) objArr5[(i23 << 3) + i25];
                                                esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
                                                objArr4 = objArr5;
                                                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cdpycssgdhVar, esjtqupxsvVar.pkzmftpjix())) {
                                                    List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.pkzmftpjix());
                                                    cdpycssgdh(zdlpuopuiuVarZoijcleaow.vdvldrhtss(), String.valueOf(list != null ? (j0.eablkybsjg) hg.jyumaefscl.weqkydbzbr(list) : null));
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                            }
                                            j16 >>= 8;
                                            i25++;
                                            objArr5 = objArr4;
                                        }
                                        objArr3 = objArr5;
                                        if (i24 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i23 == length2) {
                                        break;
                                    }
                                    i23++;
                                    jArr5 = jArr2;
                                    length = i13;
                                    objArr5 = objArr3;
                                    c14 = 7;
                                }
                            } else {
                                jArr2 = jArr5;
                                i13 = length;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i13 = length;
                            dsvhmnatus dsvhmnatusVarDraadjrbmk2 = zdlpuopuiuVarZoijcleaow.esjtqupxsv().draadjrbmk();
                            Object[] objArr6 = dsvhmnatusVarDraadjrbmk2.f4302zoijcleaow;
                            long[] jArr7 = dsvhmnatusVarDraadjrbmk2.f4299iobyxmoadg;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j17 = jArr7[i26];
                                    c13 = 7;
                                    j13 = -9187201950435737472L;
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length3)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j17 & 255) < 128) {
                                                jArr4 = jArr7;
                                                cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) objArr6[(i26 << 3) + i28];
                                                esjtqupxsv esjtqupxsvVar2 = esjtqupxsv.f35662iobyxmoadg;
                                                objArr2 = objArr6;
                                                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cdpycssgdhVar2, esjtqupxsvVar2.pkzmftpjix())) {
                                                    List list2 = (List) g0.agtfadlqog.iobyxmoadg(jVar3.zoijcleaow(), esjtqupxsvVar2.pkzmftpjix());
                                                    j0.eablkybsjg eablkybsjgVar = list2 != null ? (j0.eablkybsjg) hg.jyumaefscl.weqkydbzbr(list2) : null;
                                                    jVar2 = jVar3;
                                                    List list3 = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar2.pkzmftpjix());
                                                    j0.eablkybsjg eablkybsjgVar2 = list3 != null ? (j0.eablkybsjg) hg.jyumaefscl.weqkydbzbr(list3) : null;
                                                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjgVar2)) {
                                                        cdpycssgdh(zdlpuopuiuVarZoijcleaow.vdvldrhtss(), String.valueOf(eablkybsjgVar2));
                                                    }
                                                }
                                                j17 >>= 8;
                                                i28++;
                                                jArr7 = jArr4;
                                                objArr6 = objArr2;
                                                jVar3 = jVar2;
                                            } else {
                                                jArr4 = jArr7;
                                                objArr2 = objArr6;
                                            }
                                            jVar2 = jVar3;
                                            j17 >>= 8;
                                            i28++;
                                            jArr7 = jArr4;
                                            objArr6 = objArr2;
                                            jVar3 = jVar2;
                                        }
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        jVar = jVar3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        jVar = jVar3;
                                    }
                                    if (i26 == length3) {
                                        break;
                                    }
                                    i26++;
                                    jArr7 = jArr3;
                                    objArr6 = objArr;
                                    jVar3 = jVar;
                                }
                            }
                            i14 = 8;
                        }
                        j13 = -9187201950435737472L;
                        c13 = 7;
                        i14 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i13 = length;
                        c13 = c14;
                        j13 = j15;
                        i14 = i16;
                    }
                    j14 >>= i14;
                    i18++;
                    i16 = i14;
                    j15 = j13;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i13;
                    c14 = c13;
                    ojitshcjhnVar2 = ojitshcjhnVar;
                }
                iArr = iArr3;
                jArr = jArr5;
                int i29 = length;
                if (i17 != i16) {
                    return;
                } else {
                    length = i29;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i15 == length) {
                return;
            }
            i15++;
            ojitshcjhnVar2 = ojitshcjhnVar;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    private final void cdpycssgdh(int i13, String str) {
        c0.ppxfxbqfkf ppxfxbqfkfVar;
        if (Build.VERSION.SDK_INT >= 29 && (ppxfxbqfkfVar = this.f17818jyumaefscl) != null) {
            AutofillId autofillIdZoijcleaow = ppxfxbqfkfVar.zoijcleaow(i13);
            if (autofillIdZoijcleaow != null) {
                ppxfxbqfkfVar.gxszxtbevo(autofillIdZoijcleaow, str);
            } else {
                w.iobyxmoadg.ppxfxbqfkf("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.vdvldrhtss()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                opjhrmiecq.lereixgezr(zoijcleaowVar.f17825zdlpuopuiu, false, 1, null);
                zoijcleaowVar.istkbnxepw();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    zoijcleaowVar.pmvmpeiblj(zoijcleaowVar.f17825zdlpuopuiu.getSemanticsOwner().wkgbmnqykc(), zoijcleaowVar.f17815iozdgvuglv);
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    Trace.endSection();
                    zoijcleaowVar.btonecajqb(zoijcleaowVar.agtfadlqog());
                    zoijcleaowVar.ylkuphrtab();
                    zoijcleaowVar.f17820lmojexxdyd = false;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    private final void dxjokdxxww(int i13) {
        this.f17817iwizpuwonk.add(new draadjrbmk(i13, this.f17812cdpycssgdh, wflxmlrfwp.VIEW_DISAPPEAR, null));
    }

    private final void gtknphoqwx() {
        g0.iobyxmoadg iobyxmoadgVar;
        tg.iobyxmoadg iobyxmoadgVar2;
        ojitshcjhn ojitshcjhnVarAgtfadlqog = agtfadlqog();
        Object[] objArr = ojitshcjhnVarAgtfadlqog.f4351ppxfxbqfkf;
        long[] jArr = ojitshcjhnVarAgtfadlqog.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = ((g0.jyumaefscl) objArr[(i13 << 3) + i15]).zoijcleaow().esjtqupxsv();
                        if (g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsv.f35662iobyxmoadg.jyumaefscl()) != null && (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, g0.draadjrbmk.f35622iobyxmoadg.iobyxmoadg())) != null && (iobyxmoadgVar2 = (tg.iobyxmoadg) iobyxmoadgVar.iobyxmoadg()) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    private final void gxszxtbevo(int i13, c0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            return;
        }
        this.f17817iwizpuwonk.add(new draadjrbmk(i13, this.f17812cdpycssgdh, wflxmlrfwp.VIEW_APPEAR, eablkybsjgVar));
    }

    private final c0.eablkybsjg iozdgvuglv(zdlpuopuiu zdlpuopuiuVar, int i13) {
        c0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        AutofillId autofillIdIobyxmoadg;
        String strEablkybsjg;
        c0.ppxfxbqfkf ppxfxbqfkfVar = this.f17818jyumaefscl;
        if (ppxfxbqfkfVar == null || Build.VERSION.SDK_INT < 29 || (iobyxmoadgVarIobyxmoadg = c0.wkgbmnqykc.iobyxmoadg(this.f17825zdlpuopuiu)) == null) {
            return null;
        }
        zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVar.zdlpuopuiu();
        if (zdlpuopuiuVarZdlpuopuiu != null) {
            autofillIdIobyxmoadg = ppxfxbqfkfVar.zoijcleaow(zdlpuopuiuVarZdlpuopuiu.vdvldrhtss());
            if (autofillIdIobyxmoadg == null) {
                return null;
            }
        } else {
            autofillIdIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg();
        }
        c0.eablkybsjg eablkybsjgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf(autofillIdIobyxmoadg, zdlpuopuiuVar.vdvldrhtss());
        if (eablkybsjgVarPpxfxbqfkf == null) {
            return null;
        }
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.zynmafqrjb())) {
            return null;
        }
        Bundle bundleIobyxmoadg = eablkybsjgVarPpxfxbqfkf.iobyxmoadg();
        if (bundleIobyxmoadg != null) {
            bundleIobyxmoadg.putLong("android.view.contentcapture.EventTimestamp", this.f17812cdpycssgdh);
            bundleIobyxmoadg.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i13);
        }
        String str = (String) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.ylkuphrtab());
        if (str != null) {
            eablkybsjgVarPpxfxbqfkf.eablkybsjg(zdlpuopuiuVar.vdvldrhtss(), null, null, str);
        }
        if (((Boolean) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.iwizpuwonk())) != null) {
            eablkybsjgVarPpxfxbqfkf.zoijcleaow("android.widget.ViewGroup");
        }
        List list = (List) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.pkzmftpjix());
        if (list != null) {
            eablkybsjgVarPpxfxbqfkf.zoijcleaow("android.widget.TextView");
            eablkybsjgVarPpxfxbqfkf.gxszxtbevo(y0.ppxfxbqfkf.eablkybsjg(list, "\n", null, null, 0, null, null, 62, null));
        }
        j0.eablkybsjg eablkybsjgVar = (j0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.lqeggnwhkg());
        if (eablkybsjgVar != null) {
            eablkybsjgVarPpxfxbqfkf.zoijcleaow("android.widget.EditText");
            eablkybsjgVarPpxfxbqfkf.gxszxtbevo(eablkybsjgVar);
        }
        List list2 = (List) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.wkgbmnqykc());
        if (list2 != null) {
            eablkybsjgVarPpxfxbqfkf.ppxfxbqfkf(y0.ppxfxbqfkf.eablkybsjg(list2, "\n", null, null, 0, null, null, 62, null));
        }
        g0.nufgyqmvbu nufgyqmvbuVar = (g0.nufgyqmvbu) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.cdpycssgdh());
        if (nufgyqmvbuVar != null && (strEablkybsjg = k.eablkybsjg(nufgyqmvbuVar.rgvfuqvkyq())) != null) {
            eablkybsjgVarPpxfxbqfkf.zoijcleaow(strEablkybsjg);
        }
        f fVarPpxfxbqfkf = k.ppxfxbqfkf(wflxmlrfwpVarEsjtqupxsv);
        if (fVarPpxfxbqfkf != null) {
            e eVarDraadjrbmk = fVarPpxfxbqfkf.draadjrbmk();
            eablkybsjgVarPpxfxbqfkf.lqeggnwhkg(w0.jyumaefscl.nufgyqmvbu(eVarDraadjrbmk.dxjokdxxww().draadjrbmk()) * eVarDraadjrbmk.zoijcleaow().getDensity() * eVarDraadjrbmk.zoijcleaow().F(), 0, 0, 0);
        }
        g.lqeggnwhkg lqeggnwhkgVarBtonecajqb = zdlpuopuiuVar.btonecajqb();
        eablkybsjgVarPpxfxbqfkf.wkgbmnqykc((int) lqeggnwhkgVarBtonecajqb.nufgyqmvbu(), (int) lqeggnwhkgVarBtonecajqb.gtknphoqwx(), 0, 0, (int) (lqeggnwhkgVarBtonecajqb.dxjokdxxww() - lqeggnwhkgVarBtonecajqb.nufgyqmvbu()), (int) (lqeggnwhkgVarBtonecajqb.eablkybsjg() - lqeggnwhkgVarBtonecajqb.gtknphoqwx()));
        return eablkybsjgVarPpxfxbqfkf;
    }

    private final void istkbnxepw() {
        iozdgvuglv iozdgvuglvVar = this.f17823yadqdtsiqt;
        int[] iArr = iozdgvuglvVar.f4353zoijcleaow;
        long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = iArr[(i13 << 3) + i15];
                        if (!agtfadlqog().iobyxmoadg(i16)) {
                            dxjokdxxww(i16);
                            kcexrzcfyt();
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt() {
        this.f17821pmvmpeiblj.eablkybsjg(wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lmojexxdyd(int i13, zdlpuopuiu zdlpuopuiuVar) {
        if (vdvldrhtss()) {
            pkzmftpjix(zdlpuopuiuVar);
            gxszxtbevo(zdlpuopuiuVar.vdvldrhtss(), iozdgvuglv(zdlpuopuiuVar, i13));
            wflxmlrfwp(zdlpuopuiuVar, new lqeggnwhkg());
        }
    }

    private final void oxmwwwfdhm() {
        c0.ppxfxbqfkf ppxfxbqfkfVar = this.f17818jyumaefscl;
        if (ppxfxbqfkfVar == null || Build.VERSION.SDK_INT < 29 || this.f17817iwizpuwonk.isEmpty()) {
            return;
        }
        List list = this.f17817iwizpuwonk;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            draadjrbmk draadjrbmkVar = (draadjrbmk) list.get(i13);
            int i14 = wkgbmnqykc.f17835iobyxmoadg[draadjrbmkVar.ppxfxbqfkf().ordinal()];
            if (i14 == 1) {
                c0.eablkybsjg eablkybsjgVarZoijcleaow = draadjrbmkVar.zoijcleaow();
                if (eablkybsjgVarZoijcleaow != null) {
                    ppxfxbqfkfVar.wkgbmnqykc(eablkybsjgVarZoijcleaow.nufgyqmvbu());
                }
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AutofillId autofillIdZoijcleaow = ppxfxbqfkfVar.zoijcleaow(draadjrbmkVar.iobyxmoadg());
                if (autofillIdZoijcleaow != null) {
                    ppxfxbqfkfVar.eablkybsjg(autofillIdZoijcleaow);
                }
            }
        }
        ppxfxbqfkfVar.iobyxmoadg();
        this.f17817iwizpuwonk.clear();
    }

    private final void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        g0.iobyxmoadg iobyxmoadgVar;
        tg.draadjrbmk draadjrbmkVar;
        tg.draadjrbmk draadjrbmkVar2;
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        Boolean bool = (Boolean) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsv.f35662iobyxmoadg.jyumaefscl());
        if (this.f17814esjtqupxsv == EnumC0324zoijcleaow.SHOW_ORIGINAL && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            g0.iobyxmoadg iobyxmoadgVar2 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, g0.draadjrbmk.f35622iobyxmoadg.zynmafqrjb());
            if (iobyxmoadgVar2 == null || (draadjrbmkVar2 = (tg.draadjrbmk) iobyxmoadgVar2.iobyxmoadg()) == null) {
                return;
            }
            return;
        }
        if (this.f17814esjtqupxsv != EnumC0324zoijcleaow.SHOW_TRANSLATED || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE) || (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, g0.draadjrbmk.f35622iobyxmoadg.zynmafqrjb())) == null || (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) == null) {
            return;
        }
    }

    private final void pmvmpeiblj(zdlpuopuiu zdlpuopuiuVar, j jVar) {
        wflxmlrfwp(zdlpuopuiuVar, new gxszxtbevo(jVar, this));
        List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
        int size = listJyumaefscl.size();
        for (int i13 = 0; i13 < size; i13++) {
            zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) listJyumaefscl.get(i13);
            if (agtfadlqog().iobyxmoadg(zdlpuopuiuVar2.vdvldrhtss()) && this.f17823yadqdtsiqt.iobyxmoadg(zdlpuopuiuVar2.vdvldrhtss())) {
                Object objZoijcleaow = this.f17823yadqdtsiqt.zoijcleaow(zdlpuopuiuVar2.vdvldrhtss());
                if (objZoijcleaow == null) {
                    w.iobyxmoadg.ppxfxbqfkf("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                pmvmpeiblj(zdlpuopuiuVar2, (j) objZoijcleaow);
            }
        }
    }

    private final void rgvfuqvkyq() {
        g0.iobyxmoadg iobyxmoadgVar;
        tg.draadjrbmk draadjrbmkVar;
        ojitshcjhn ojitshcjhnVarAgtfadlqog = agtfadlqog();
        Object[] objArr = ojitshcjhnVarAgtfadlqog.f4351ppxfxbqfkf;
        long[] jArr = ojitshcjhnVarAgtfadlqog.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = ((g0.jyumaefscl) objArr[(i13 << 3) + i15]).zoijcleaow().esjtqupxsv();
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsv.f35662iobyxmoadg.jyumaefscl()), Boolean.TRUE) && (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, g0.draadjrbmk.f35622iobyxmoadg.zynmafqrjb())) != null && (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    private final void wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
        int size = listJyumaefscl.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = listJyumaefscl.get(i14);
            if (agtfadlqog().iobyxmoadg(((zdlpuopuiu) obj).vdvldrhtss())) {
                rgvfuqvkyqVar.invoke(Integer.valueOf(i13), obj);
                i13++;
            }
        }
    }

    private final void wwaezpbzkn(zdlpuopuiu zdlpuopuiuVar) {
        if (vdvldrhtss()) {
            dxjokdxxww(zdlpuopuiuVar.vdvldrhtss());
            List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
            int size = listJyumaefscl.size();
            for (int i13 = 0; i13 < size; i13++) {
                wwaezpbzkn((zdlpuopuiu) listJyumaefscl.get(i13));
            }
        }
    }

    private final void yadqdtsiqt() {
        g0.iobyxmoadg iobyxmoadgVar;
        tg.draadjrbmk draadjrbmkVar;
        ojitshcjhn ojitshcjhnVarAgtfadlqog = agtfadlqog();
        Object[] objArr = ojitshcjhnVarAgtfadlqog.f4351ppxfxbqfkf;
        long[] jArr = ojitshcjhnVarAgtfadlqog.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = ((g0.jyumaefscl) objArr[(i13 << 3) + i15]).zoijcleaow().esjtqupxsv();
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsv.f35662iobyxmoadg.jyumaefscl()), Boolean.FALSE) && (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, g0.draadjrbmk.f35622iobyxmoadg.zynmafqrjb())) != null && (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    private final void ylkuphrtab() {
        this.f17823yadqdtsiqt.lqeggnwhkg();
        ojitshcjhn ojitshcjhnVarAgtfadlqog = agtfadlqog();
        int[] iArr = ojitshcjhnVarAgtfadlqog.f4353zoijcleaow;
        Object[] objArr = ojitshcjhnVarAgtfadlqog.f4351ppxfxbqfkf;
        long[] jArr = ojitshcjhnVarAgtfadlqog.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            this.f17823yadqdtsiqt.oxmwwwfdhm(iArr[i16], new j(((g0.jyumaefscl) objArr[i16]).zoijcleaow(), agtfadlqog()));
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        this.f17815iozdgvuglv = new j(this.f17825zdlpuopuiu.getSemanticsOwner().wkgbmnqykc(), agtfadlqog());
    }

    public final ojitshcjhn agtfadlqog() {
        if (this.f17819lereixgezr) {
            this.f17819lereixgezr = false;
            this.f17816istkbnxepw = cqumvgiudr.iobyxmoadg(this.f17825zdlpuopuiu.getSemanticsOwner(), -1);
            this.f17812cdpycssgdh = System.currentTimeMillis();
        }
        return this.f17816istkbnxepw;
    }

    public final void cqumvgiudr() {
        this.f17819lereixgezr = true;
        if (!vdvldrhtss() || this.f17820lmojexxdyd) {
            return;
        }
        this.f17820lmojexxdyd = true;
        this.f17826zynmafqrjb.post(this.f17822wwaezpbzkn);
    }

    public final void esjtqupxsv() {
        this.f17814esjtqupxsv = EnumC0324zoijcleaow.SHOW_TRANSLATED;
        yadqdtsiqt();
    }

    public final void iwizpuwonk() {
        this.f17819lereixgezr = true;
        if (vdvldrhtss()) {
            kcexrzcfyt();
        }
    }

    public final void jyumaefscl() {
        this.f17814esjtqupxsv = EnumC0324zoijcleaow.SHOW_ORIGINAL;
        rgvfuqvkyq();
    }

    public final void lereixgezr(zoijcleaow zoijcleaowVar, LongSparseArray longSparseArray) {
        ppxfxbqfkf.f17834iobyxmoadg.wkgbmnqykc(zoijcleaowVar, longSparseArray);
    }

    public final AndroidComposeView ojitshcjhn() {
        return this.f17825zdlpuopuiu;
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onStart(vdvldrhtss vdvldrhtssVar) {
        this.f17818jyumaefscl = (c0.ppxfxbqfkf) this.f17824yggfygwlhe.invoke();
        lmojexxdyd(-1, this.f17825zdlpuopuiu.getSemanticsOwner().wkgbmnqykc());
        oxmwwwfdhm();
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onStop(vdvldrhtss vdvldrhtssVar) {
        wwaezpbzkn(this.f17825zdlpuopuiu.getSemanticsOwner().wkgbmnqykc());
        oxmwwwfdhm();
        this.f17818jyumaefscl = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f17826zynmafqrjb.removeCallbacks(this.f17822wwaezpbzkn);
        this.f17818jyumaefscl = null;
    }

    public final boolean vdvldrhtss() {
        return agtfadlqog.f17796gxszxtbevo.iobyxmoadg() && this.f17818jyumaefscl != null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object wkgbmnqykc(lg.gxszxtbevo r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c.zoijcleaow.eablkybsjg
            if (r0 == 0) goto L13
            r0 = r9
            c.zoijcleaow$eablkybsjg r0 = (c.zoijcleaow.eablkybsjg) r0
            int r1 = r0.f17827iwizpuwonk
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17827iwizpuwonk = r1
            goto L18
        L13:
            c.zoijcleaow$eablkybsjg r0 = new c.zoijcleaow$eablkybsjg
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17829yggfygwlhe
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f17827iwizpuwonk
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f17830zdlpuopuiu
            rj.dxjokdxxww r2 = (rj.dxjokdxxww) r2
            gg.zdlpuopuiu.zoijcleaow(r9)
        L2f:
            r9 = r2
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f17830zdlpuopuiu
            rj.dxjokdxxww r2 = (rj.dxjokdxxww) r2
            gg.zdlpuopuiu.zoijcleaow(r9)
            goto L58
        L41:
            gg.zdlpuopuiu.zoijcleaow(r9)
            rj.lqeggnwhkg r9 = r8.f17821pmvmpeiblj
            rj.dxjokdxxww r9 = r9.iterator()
        L4a:
            r0.f17830zdlpuopuiu = r9
            r0.f17827iwizpuwonk = r4
            java.lang.Object r2 = r9.iobyxmoadg(r0)
            if (r2 != r1) goto L55
            return r1
        L55:
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r2.next()
            boolean r9 = r8.vdvldrhtss()
            if (r9 == 0) goto L6c
            r8.oxmwwwfdhm()
        L6c:
            boolean r9 = r8.f17820lmojexxdyd
            if (r9 != 0) goto L79
            r8.f17820lmojexxdyd = r4
            android.os.Handler r9 = r8.f17826zynmafqrjb
            java.lang.Runnable r5 = r8.f17822wwaezpbzkn
            r9.post(r5)
        L79:
            long r5 = r8.f17813cqumvgiudr
            r0.f17830zdlpuopuiu = r2
            r0.f17827iwizpuwonk = r3
            java.lang.Object r9 = pj.crxdokpmqz.zoijcleaow(r5, r0)
            if (r9 != r1) goto L2f
            return r1
        L86:
            gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.zoijcleaow.wkgbmnqykc(lg.gxszxtbevo):java.lang.Object");
    }

    public final void yggfygwlhe(long[] jArr, int[] iArr, Consumer consumer) {
        ppxfxbqfkf.f17834iobyxmoadg.ppxfxbqfkf(this, jArr, iArr, consumer);
    }

    public final void zdlpuopuiu() {
        this.f17814esjtqupxsv = EnumC0324zoijcleaow.SHOW_ORIGINAL;
        gtknphoqwx();
    }
}
