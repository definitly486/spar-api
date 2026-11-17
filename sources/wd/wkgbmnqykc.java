package wd;

import android.net.Uri;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.hkdspvbjdz;
import lg.btonecajqb;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import org.json.JSONObject;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements wd.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f119397wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ud.zoijcleaow f119398iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119399ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final btonecajqb f119400zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f119401cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f119402iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Map f119403jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f119405zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Map map, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f119403jyumaefscl = map;
            this.f119402iwizpuwonk = rgvfuqvkyqVar;
            this.f119401cqumvgiudr = rgvfuqvkyqVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(this.f119403jyumaefscl, this.f119402iwizpuwonk, this.f119401cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f119405zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    URLConnection uRLConnectionOpenConnection = wkgbmnqykc.this.ppxfxbqfkf().openConnection();
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
                    for (Map.Entry entry : this.f119403jyumaefscl.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb3 = new StringBuilder();
                        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                        while (true) {
                            String line = bufferedReader.readLine();
                            hkdspvbjdzVar.f60015zdlpuopuiu = line;
                            if (line == null) {
                                break;
                            }
                            sb3.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb3.toString());
                        rgvfuqvkyq rgvfuqvkyqVar = this.f119402iwizpuwonk;
                        this.f119405zdlpuopuiu = 1;
                        if (rgvfuqvkyqVar.invoke(jSONObject, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        rgvfuqvkyq rgvfuqvkyqVar2 = this.f119401cqumvgiudr;
                        String str = "Bad response code: " + responseCode;
                        this.f119405zdlpuopuiu = 2;
                        if (rgvfuqvkyqVar2.invoke(str, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2 && i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
            } catch (Exception e13) {
                rgvfuqvkyq rgvfuqvkyqVar3 = this.f119401cqumvgiudr;
                String message = e13.getMessage();
                if (message == null) {
                    message = e13.toString();
                }
                this.f119405zdlpuopuiu = 3;
                if (rgvfuqvkyqVar3.invoke(message, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public wkgbmnqykc(ud.zoijcleaow appInfo, btonecajqb blockingDispatcher, String baseUrl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appInfo, "appInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseUrl, "baseUrl");
        this.f119398iobyxmoadg = appInfo;
        this.f119400zoijcleaow = blockingDispatcher;
        this.f119399ppxfxbqfkf = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL ppxfxbqfkf() {
        return new URL(new Uri.Builder().scheme(HostSelectionInterceptorImpl.PROTOCOL_HTTPS).authority(this.f119399ppxfxbqfkf).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp").appendPath(this.f119398iobyxmoadg.zoijcleaow()).appendPath("settings").appendQueryParameter("build_version", this.f119398iobyxmoadg.iobyxmoadg().iobyxmoadg()).appendQueryParameter("display_version", this.f119398iobyxmoadg.iobyxmoadg().gxszxtbevo()).build().toString());
    }

    @Override // wd.iobyxmoadg
    public Object iobyxmoadg(Map map, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(this.f119400zoijcleaow, new zoijcleaow(map, rgvfuqvkyqVar, rgvfuqvkyqVar2, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    public /* synthetic */ wkgbmnqykc(ud.zoijcleaow zoijcleaowVar, btonecajqb btonecajqbVar, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, btonecajqbVar, (i13 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
