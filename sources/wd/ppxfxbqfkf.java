package wd;

import android.os.Build;
import android.util.Log;
import gg.cqumvgiudr;
import gg.gtknphoqwx;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Arrays;
import java.util.Map;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.tzroggbefp;
import lg.btonecajqb;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.json.JSONException;
import org.json.JSONObject;
import tg.rgvfuqvkyq;
import ud.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements nufgyqmvbu {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final iobyxmoadg f119377lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f119378eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yj.iobyxmoadg f119379gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f119380iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ud.zoijcleaow f119381ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wd.iobyxmoadg f119382wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final uc.eablkybsjg f119383zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f119384yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f119385zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f119384yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f119385zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f119384yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(String str, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(str, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: wd.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2979ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f119386cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f119388jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f119389yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f119390zdlpuopuiu;

        C2979ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f119388jyumaefscl = obj;
            this.f119386cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wkgbmnqykc(this);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f119392iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f119393jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f119394yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f119395zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = ppxfxbqfkf.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f119392iwizpuwonk = obj;
            return wkgbmnqykcVar;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:47:0x0114 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x011b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0134 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x013b  */
        /* JADX WARN: Code duplicated, block: B:57:0x0154 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0158  */
        /* JADX WARN: Code duplicated, block: B:61:0x015b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0177 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0195 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws JSONException {
            hkdspvbjdz hkdspvbjdzVar;
            Boolean bool;
            hkdspvbjdz hkdspvbjdzVar2;
            hkdspvbjdz hkdspvbjdzVar3;
            hkdspvbjdz hkdspvbjdzVar4;
            hkdspvbjdz hkdspvbjdzVar5;
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo;
            Integer num;
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo2;
            Double d13;
            wwaezpbzkn wwaezpbzknVar;
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo3;
            Integer num2;
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo4;
            Integer numWkgbmnqykc;
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo5;
            Long lEablkybsjg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f119393jyumaefscl) {
                case 0:
                    zdlpuopuiu.zoijcleaow(obj);
                    JSONObject jSONObject = (JSONObject) this.f119392iwizpuwonk;
                    Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                    hkdspvbjdz hkdspvbjdzVar6 = new hkdspvbjdz();
                    hkdspvbjdzVar = new hkdspvbjdz();
                    hkdspvbjdz hkdspvbjdzVar7 = new hkdspvbjdz();
                    if (jSONObject.has("app_quality")) {
                        Object obj2 = jSONObject.get("app_quality");
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                            try {
                                if (jSONObject2.has("sampling_rate")) {
                                    hkdspvbjdzVar6.f60015zdlpuopuiu = (Double) jSONObject2.get("sampling_rate");
                                }
                                if (jSONObject2.has("session_timeout_seconds")) {
                                    hkdspvbjdzVar.f60015zdlpuopuiu = (Integer) jSONObject2.get("session_timeout_seconds");
                                }
                                if (jSONObject2.has("cache_duration")) {
                                    hkdspvbjdzVar7.f60015zdlpuopuiu = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e13) {
                                e = e13;
                                Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                            }
                        } catch (JSONException e14) {
                            e = e14;
                            bool = null;
                        }
                        break;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        lqeggnwhkg lqeggnwhkgVarGxszxtbevo6 = ppxfxbqfkf.this.gxszxtbevo();
                        this.f119392iwizpuwonk = hkdspvbjdzVar6;
                        this.f119395zdlpuopuiu = hkdspvbjdzVar;
                        this.f119394yggfygwlhe = hkdspvbjdzVar7;
                        this.f119393jyumaefscl = 1;
                        if (lqeggnwhkgVarGxszxtbevo6.agtfadlqog(bool, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        hkdspvbjdzVar4 = hkdspvbjdzVar6;
                        hkdspvbjdzVar5 = hkdspvbjdzVar;
                        hkdspvbjdzVar3 = hkdspvbjdzVar7;
                        hkdspvbjdzVar = hkdspvbjdzVar5;
                        hkdspvbjdzVar2 = hkdspvbjdzVar4;
                    } else {
                        hkdspvbjdzVar2 = hkdspvbjdzVar6;
                        hkdspvbjdzVar3 = hkdspvbjdzVar7;
                    }
                    if (((Integer) hkdspvbjdzVar.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo = ppxfxbqfkf.this.gxszxtbevo();
                        num = (Integer) hkdspvbjdzVar.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = hkdspvbjdzVar2;
                        this.f119395zdlpuopuiu = hkdspvbjdzVar3;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 2;
                        if (lqeggnwhkgVarGxszxtbevo.wflxmlrfwp(num, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    if (((Double) hkdspvbjdzVar2.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo2 = ppxfxbqfkf.this.gxszxtbevo();
                        d13 = (Double) hkdspvbjdzVar2.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = hkdspvbjdzVar3;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 3;
                        if (lqeggnwhkgVarGxszxtbevo2.dxjokdxxww(d13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    if (((Integer) hkdspvbjdzVar3.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo3 = ppxfxbqfkf.this.gxszxtbevo();
                        num2 = (Integer) hkdspvbjdzVar3.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 4;
                        if (lqeggnwhkgVarGxszxtbevo3.btonecajqb(num2, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        wwaezpbzknVar = null;
                    }
                    if (wwaezpbzknVar == null) {
                        lqeggnwhkgVarGxszxtbevo4 = ppxfxbqfkf.this.gxszxtbevo();
                        numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(86400);
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 5;
                        if (lqeggnwhkgVarGxszxtbevo4.btonecajqb(numWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 1:
                    hkdspvbjdzVar3 = (hkdspvbjdz) this.f119394yggfygwlhe;
                    hkdspvbjdzVar5 = (hkdspvbjdz) this.f119395zdlpuopuiu;
                    hkdspvbjdzVar4 = (hkdspvbjdz) this.f119392iwizpuwonk;
                    zdlpuopuiu.zoijcleaow(obj);
                    hkdspvbjdzVar = hkdspvbjdzVar5;
                    hkdspvbjdzVar2 = hkdspvbjdzVar4;
                    if (((Integer) hkdspvbjdzVar.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo = ppxfxbqfkf.this.gxszxtbevo();
                        num = (Integer) hkdspvbjdzVar.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = hkdspvbjdzVar2;
                        this.f119395zdlpuopuiu = hkdspvbjdzVar3;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 2;
                        if (lqeggnwhkgVarGxszxtbevo.wflxmlrfwp(num, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    if (((Double) hkdspvbjdzVar2.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo2 = ppxfxbqfkf.this.gxszxtbevo();
                        d13 = (Double) hkdspvbjdzVar2.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = hkdspvbjdzVar3;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 3;
                        if (lqeggnwhkgVarGxszxtbevo2.dxjokdxxww(d13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    if (((Integer) hkdspvbjdzVar3.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo3 = ppxfxbqfkf.this.gxszxtbevo();
                        num2 = (Integer) hkdspvbjdzVar3.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 4;
                        if (lqeggnwhkgVarGxszxtbevo3.btonecajqb(num2, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        wwaezpbzknVar = null;
                    }
                    if (wwaezpbzknVar == null) {
                        lqeggnwhkgVarGxszxtbevo4 = ppxfxbqfkf.this.gxszxtbevo();
                        numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(86400);
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 5;
                        if (lqeggnwhkgVarGxszxtbevo4.btonecajqb(numWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 2:
                    hkdspvbjdzVar3 = (hkdspvbjdz) this.f119395zdlpuopuiu;
                    hkdspvbjdzVar2 = (hkdspvbjdz) this.f119392iwizpuwonk;
                    zdlpuopuiu.zoijcleaow(obj);
                    if (((Double) hkdspvbjdzVar2.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo2 = ppxfxbqfkf.this.gxszxtbevo();
                        d13 = (Double) hkdspvbjdzVar2.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = hkdspvbjdzVar3;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 3;
                        if (lqeggnwhkgVarGxszxtbevo2.dxjokdxxww(d13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    if (((Integer) hkdspvbjdzVar3.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo3 = ppxfxbqfkf.this.gxszxtbevo();
                        num2 = (Integer) hkdspvbjdzVar3.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 4;
                        if (lqeggnwhkgVarGxszxtbevo3.btonecajqb(num2, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        wwaezpbzknVar = null;
                    }
                    if (wwaezpbzknVar == null) {
                        lqeggnwhkgVarGxszxtbevo4 = ppxfxbqfkf.this.gxszxtbevo();
                        numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(86400);
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 5;
                        if (lqeggnwhkgVarGxszxtbevo4.btonecajqb(numWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 3:
                    hkdspvbjdzVar3 = (hkdspvbjdz) this.f119392iwizpuwonk;
                    zdlpuopuiu.zoijcleaow(obj);
                    if (((Integer) hkdspvbjdzVar3.f60015zdlpuopuiu) != null) {
                        lqeggnwhkgVarGxszxtbevo3 = ppxfxbqfkf.this.gxszxtbevo();
                        num2 = (Integer) hkdspvbjdzVar3.f60015zdlpuopuiu;
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 4;
                        if (lqeggnwhkgVarGxszxtbevo3.btonecajqb(num2, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        wwaezpbzknVar = null;
                    }
                    if (wwaezpbzknVar == null) {
                        lqeggnwhkgVarGxszxtbevo4 = ppxfxbqfkf.this.gxszxtbevo();
                        numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(86400);
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 5;
                        if (lqeggnwhkgVarGxszxtbevo4.btonecajqb(numWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 4:
                    zdlpuopuiu.zoijcleaow(obj);
                    wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    if (wwaezpbzknVar == null) {
                        lqeggnwhkgVarGxszxtbevo4 = ppxfxbqfkf.this.gxszxtbevo();
                        numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(86400);
                        this.f119392iwizpuwonk = null;
                        this.f119395zdlpuopuiu = null;
                        this.f119394yggfygwlhe = null;
                        this.f119393jyumaefscl = 5;
                        if (lqeggnwhkgVarGxszxtbevo4.btonecajqb(numWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 5:
                    zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkgVarGxszxtbevo5 = ppxfxbqfkf.this.gxszxtbevo();
                    lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis());
                    this.f119392iwizpuwonk = null;
                    this.f119395zdlpuopuiu = null;
                    this.f119394yggfygwlhe = null;
                    this.f119393jyumaefscl = 6;
                    if (lqeggnwhkgVarGxszxtbevo5.gtknphoqwx(lEablkybsjg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                case 6:
                    zdlpuopuiu.zoijcleaow(obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(jSONObject, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ d2.eablkybsjg f119396zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(d2.eablkybsjg eablkybsjgVar) {
            super(0);
            this.f119396zdlpuopuiu = eablkybsjgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final lqeggnwhkg invoke() {
            return new lqeggnwhkg(this.f119396zdlpuopuiu);
        }
    }

    public ppxfxbqfkf(btonecajqb backgroundDispatcher, uc.eablkybsjg firebaseInstallationsApi, ud.zoijcleaow appInfo, wd.iobyxmoadg configsFetcher, d2.eablkybsjg dataStore) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appInfo, "appInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dataStore, "dataStore");
        this.f119380iobyxmoadg = backgroundDispatcher;
        this.f119383zoijcleaow = firebaseInstallationsApi;
        this.f119381ppxfxbqfkf = appInfo;
        this.f119382wkgbmnqykc = configsFetcher;
        this.f119378eablkybsjg = gg.draadjrbmk.zoijcleaow(new zoijcleaow(dataStore));
        this.f119379gxszxtbevo = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lqeggnwhkg gxszxtbevo() {
        return (lqeggnwhkg) this.f119378eablkybsjg.getValue();
    }

    private final String lqeggnwhkg(String str) {
        return new mj.rgvfuqvkyq(CardDateFormatTextWatcher.DIVIDER_CHARACTER).rgvfuqvkyq(str, "");
    }

    @Override // wd.nufgyqmvbu
    public Boolean iobyxmoadg() {
        return gxszxtbevo().lqeggnwhkg();
    }

    @Override // wd.nufgyqmvbu
    public Double ppxfxbqfkf() {
        return gxszxtbevo().gxszxtbevo();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c5 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd.nufgyqmvbu
    public Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2979ppxfxbqfkf c2979ppxfxbqfkf;
        yj.iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        Throwable th2;
        yj.iobyxmoadg iobyxmoadgVar3;
        String strZoijcleaow;
        Map mapDraadjrbmk;
        wd.iobyxmoadg iobyxmoadgVar4;
        wkgbmnqykc wkgbmnqykcVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof C2979ppxfxbqfkf) {
            c2979ppxfxbqfkf = (C2979ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c2979ppxfxbqfkf.f119386cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2979ppxfxbqfkf.f119386cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c2979ppxfxbqfkf = new C2979ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c2979ppxfxbqfkf = new C2979ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = c2979ppxfxbqfkf.f119388jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2979ppxfxbqfkf.f119386cqumvgiudr;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!this.f119379gxszxtbevo.wkgbmnqykc() && !gxszxtbevo().wkgbmnqykc()) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadgVar = this.f119379gxszxtbevo;
                c2979ppxfxbqfkf.f119390zdlpuopuiu = this;
                c2979ppxfxbqfkf.f119389yggfygwlhe = iobyxmoadgVar;
                c2979ppxfxbqfkf.f119386cqumvgiudr = 1;
                if (iobyxmoadgVar.iobyxmoadg(null, c2979ppxfxbqfkf) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (yj.iobyxmoadg) c2979ppxfxbqfkf.f119390zdlpuopuiu;
                        try {
                            zdlpuopuiu.zoijcleaow(obj);
                            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                            iobyxmoadgVar2.eablkybsjg(null);
                            return wwaezpbzkn.f37140iobyxmoadg;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iobyxmoadgVar2.eablkybsjg(null);
                            throw th2;
                        }
                    }
                    iobyxmoadgVar3 = (yj.iobyxmoadg) c2979ppxfxbqfkf.f119389yggfygwlhe;
                    ppxfxbqfkfVar = (ppxfxbqfkf) c2979ppxfxbqfkf.f119390zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(obj);
                        strZoijcleaow = ((kcexrzcfyt) obj).zoijcleaow();
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strZoijcleaow, "")) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                            iobyxmoadgVar3.eablkybsjg(null);
                            return wwaezpbzknVar2;
                        }
                        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg("X-Crashlytics-Installation-ID", strZoijcleaow);
                        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
                        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(format, *args)");
                        vdvldrhtss vdvldrhtssVarIobyxmoadg2 = cqumvgiudr.iobyxmoadg("X-Crashlytics-Device-Model", ppxfxbqfkfVar.lqeggnwhkg(str));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(INCREMENTAL, "INCREMENTAL");
                        vdvldrhtss vdvldrhtssVarIobyxmoadg3 = cqumvgiudr.iobyxmoadg("X-Crashlytics-OS-Build-Version", ppxfxbqfkfVar.lqeggnwhkg(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(RELEASE, "RELEASE");
                        mapDraadjrbmk = hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, vdvldrhtssVarIobyxmoadg3, cqumvgiudr.iobyxmoadg("X-Crashlytics-OS-Display-Version", ppxfxbqfkfVar.lqeggnwhkg(RELEASE)), cqumvgiudr.iobyxmoadg("X-Crashlytics-API-Client-Version", ppxfxbqfkfVar.f119381ppxfxbqfkf.gxszxtbevo()));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        iobyxmoadgVar4 = ppxfxbqfkfVar.f119382wkgbmnqykc;
                        wkgbmnqykcVar = ppxfxbqfkfVar.new wkgbmnqykc(null);
                        eablkybsjgVar = new eablkybsjg(null);
                        c2979ppxfxbqfkf.f119390zdlpuopuiu = iobyxmoadgVar3;
                        c2979ppxfxbqfkf.f119389yggfygwlhe = null;
                        c2979ppxfxbqfkf.f119386cqumvgiudr = 3;
                        if (iobyxmoadgVar4.iobyxmoadg(mapDraadjrbmk, wkgbmnqykcVar, eablkybsjgVar, c2979ppxfxbqfkf) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar2 = iobyxmoadgVar3;
                        wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                        iobyxmoadgVar2.eablkybsjg(null);
                        return wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th4) {
                        th2 = th4;
                        iobyxmoadgVar2 = iobyxmoadgVar3;
                        iobyxmoadgVar2.eablkybsjg(null);
                        throw th2;
                    }
                }
                yj.iobyxmoadg iobyxmoadgVar5 = (yj.iobyxmoadg) c2979ppxfxbqfkf.f119389yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) c2979ppxfxbqfkf.f119390zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar = iobyxmoadgVar5;
            }
            if (!ppxfxbqfkfVar.gxszxtbevo().wkgbmnqykc()) {
                Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar.eablkybsjg(null);
                return wwaezpbzknVar4;
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f113391ppxfxbqfkf;
            uc.eablkybsjg eablkybsjgVar2 = ppxfxbqfkfVar.f119383zoijcleaow;
            c2979ppxfxbqfkf.f119390zdlpuopuiu = ppxfxbqfkfVar;
            c2979ppxfxbqfkf.f119389yggfygwlhe = iobyxmoadgVar;
            c2979ppxfxbqfkf.f119386cqumvgiudr = 2;
            Object objIobyxmoadg = iobyxmoadgVar6.iobyxmoadg(eablkybsjgVar2, c2979ppxfxbqfkf);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar;
            obj = objIobyxmoadg;
            strZoijcleaow = ((kcexrzcfyt) obj).zoijcleaow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strZoijcleaow, "")) {
                Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar3.eablkybsjg(null);
                return wwaezpbzknVar5;
            }
            vdvldrhtss vdvldrhtssVarIobyxmoadg4 = cqumvgiudr.iobyxmoadg("X-Crashlytics-Installation-ID", strZoijcleaow);
            tzroggbefp tzroggbefpVar2 = tzroggbefp.f60034iobyxmoadg;
            String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "format(format, *args)");
            vdvldrhtss vdvldrhtssVarIobyxmoadg5 = cqumvgiudr.iobyxmoadg("X-Crashlytics-Device-Model", ppxfxbqfkfVar.lqeggnwhkg(str2));
            String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(INCREMENTAL2, "INCREMENTAL");
            vdvldrhtss vdvldrhtssVarIobyxmoadg6 = cqumvgiudr.iobyxmoadg("X-Crashlytics-OS-Build-Version", ppxfxbqfkfVar.lqeggnwhkg(INCREMENTAL2));
            String RELEASE2 = Build.VERSION.RELEASE;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(RELEASE2, "RELEASE");
            mapDraadjrbmk = hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg4, vdvldrhtssVarIobyxmoadg5, vdvldrhtssVarIobyxmoadg6, cqumvgiudr.iobyxmoadg("X-Crashlytics-OS-Display-Version", ppxfxbqfkfVar.lqeggnwhkg(RELEASE2)), cqumvgiudr.iobyxmoadg("X-Crashlytics-API-Client-Version", ppxfxbqfkfVar.f119381ppxfxbqfkf.gxszxtbevo()));
            Log.d("SessionConfigFetcher", "Fetching settings from server.");
            iobyxmoadgVar4 = ppxfxbqfkfVar.f119382wkgbmnqykc;
            wkgbmnqykcVar = ppxfxbqfkfVar.new wkgbmnqykc(null);
            eablkybsjgVar = new eablkybsjg(null);
            c2979ppxfxbqfkf.f119390zdlpuopuiu = iobyxmoadgVar3;
            c2979ppxfxbqfkf.f119389yggfygwlhe = null;
            c2979ppxfxbqfkf.f119386cqumvgiudr = 3;
            if (iobyxmoadgVar4.iobyxmoadg(mapDraadjrbmk, wkgbmnqykcVar, eablkybsjgVar, c2979ppxfxbqfkf) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
            wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar2.eablkybsjg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th5) {
            iobyxmoadgVar2 = iobyxmoadgVar;
            th2 = th5;
            iobyxmoadgVar2.eablkybsjg(null);
            throw th2;
        }
    }

    @Override // wd.nufgyqmvbu
    public nj.iobyxmoadg zoijcleaow() {
        Integer numEablkybsjg = gxszxtbevo().eablkybsjg();
        if (numEablkybsjg == null) {
            return null;
        }
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        return nj.iobyxmoadg.gxszxtbevo(nj.ppxfxbqfkf.kcexrzcfyt(numEablkybsjg.intValue(), nj.wkgbmnqykc.SECONDS));
    }
}
