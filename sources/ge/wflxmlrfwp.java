package ge;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final Feature f36938agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final Feature f36939btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final Feature f36940cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final Feature f36941draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final Feature f36942dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final Feature f36943eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final Feature f36944esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final Feature f36945gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final Feature f36946gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Feature[] f36947iobyxmoadg = new Feature[0];

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final Feature f36948iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final Feature f36949jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final Feature f36950kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final Feature f36951lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final Feature f36952lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final Feature f36953nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final Feature f36954ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final Feature f36955oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final zzai f36956pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Feature f36957ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final Feature f36958rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final Feature f36959vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final Feature f36960wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final Feature f36961wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final Feature f36962yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final Feature f36963zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final Feature f36964zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final zzai f36965zynmafqrjb;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f36964zoijcleaow = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f36957ppxfxbqfkf = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f36961wkgbmnqykc = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f36943eablkybsjg = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f36946gxszxtbevo = feature5;
        f36952lqeggnwhkg = new Feature("mlkit.ocr.chinese", 1L);
        f36953nufgyqmvbu = new Feature("mlkit.ocr.common", 1L);
        f36942dxjokdxxww = new Feature("mlkit.ocr.devanagari", 1L);
        f36939btonecajqb = new Feature("mlkit.ocr.japanese", 1L);
        f36945gtknphoqwx = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f36941draadjrbmk = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f36960wflxmlrfwp = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f36938agtfadlqog = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f36954ojitshcjhn = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f36958rgvfuqvkyq = feature10;
        f36959vdvldrhtss = new Feature("mlkit.image.caption", 1L);
        f36955oxmwwwfdhm = new Feature("mlkit.docscan.detect", 1L);
        f36950kcexrzcfyt = new Feature("mlkit.docscan.crop", 1L);
        f36963zdlpuopuiu = new Feature("mlkit.docscan.enhance", 1L);
        f36962yggfygwlhe = new Feature("mlkit.docscan.ui", 1L);
        f36949jyumaefscl = new Feature("mlkit.docscan.stain", 1L);
        f36948iwizpuwonk = new Feature("mlkit.docscan.shadow", 1L);
        f36940cqumvgiudr = new Feature("mlkit.quality.aesthetic", 1L);
        f36944esjtqupxsv = new Feature("mlkit.quality.technical", 1L);
        f36951lereixgezr = new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", feature);
        zzahVar.zza("custom_ica", feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza("ica", feature4);
        zzahVar.zza("ocr", feature5);
        zzahVar.zza("langid", feature6);
        zzahVar.zza("nlclassifier", feature7);
        zzahVar.zza("tflite_dynamite", feature8);
        zzahVar.zza("barcode_ui", feature9);
        zzahVar.zza("smart_reply", feature10);
        f36956pmvmpeiblj = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzahVar2.zza("com.google.android.gms.vision.face", feature3);
        zzahVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f36965zynmafqrjb = zzahVar2.zzb();
    }

    public static void eablkybsjg(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: ge.zynmafqrjb
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = wflxmlrfwp.f36947iobyxmoadg;
                return featureArr;
            }
        }).build()).addOnFailureListener(new OnFailureListener() { // from class: ge.istkbnxepw
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static Feature[] gxszxtbevo(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            featureArr[i13] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i13)));
        }
        return featureArr;
    }

    public static boolean iobyxmoadg(Context context, List list) throws Throwable {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return zoijcleaow(context, gxszxtbevo(f36965zynmafqrjb, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    public static void ppxfxbqfkf(Context context, String str) {
        wkgbmnqykc(context, zzaf.zzh(str));
    }

    public static void wkgbmnqykc(Context context, List list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            eablkybsjg(context, gxszxtbevo(f36956pmvmpeiblj, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(StringUtils.COMMA, list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static boolean zoijcleaow(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: ge.cdpycssgdh
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = wflxmlrfwp.f36947iobyxmoadg;
                    return featureArr;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: ge.yadqdtsiqt
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e13) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e13);
            return false;
        }
    }
}
