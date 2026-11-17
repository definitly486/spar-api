package le;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final SparseArray f62191iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final AtomicReference f62192ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f62193wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final SparseArray f62194zoijcleaow;

    static {
        SparseArray sparseArray = new SparseArray();
        f62191iobyxmoadg = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f62194zoijcleaow = sparseArray2;
        f62192ppxfxbqfkf = new AtomicReference();
        sparseArray.put(-1, zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, zzrn.FORMAT_CODE_128);
        sparseArray.put(2, zzrn.FORMAT_CODE_39);
        sparseArray.put(4, zzrn.FORMAT_CODE_93);
        sparseArray.put(8, zzrn.FORMAT_CODABAR);
        sparseArray.put(16, zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzrn.FORMAT_EAN_13);
        sparseArray.put(64, zzrn.FORMAT_EAN_8);
        sparseArray.put(UserVerificationMethods.USER_VERIFY_PATTERN, zzrn.FORMAT_ITF);
        sparseArray.put(UserVerificationMethods.USER_VERIFY_HANDPRINT, zzrn.FORMAT_QR_CODE);
        sparseArray.put(UserVerificationMethods.USER_VERIFY_NONE, zzrn.FORMAT_UPC_A);
        sparseArray.put(UserVerificationMethods.USER_VERIFY_ALL, zzrn.FORMAT_UPC_E);
        sparseArray.put(2048, zzrn.FORMAT_PDF417);
        sparseArray.put(4096, zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzro.TYPE_EMAIL);
        sparseArray2.put(3, zzro.TYPE_ISBN);
        sparseArray2.put(4, zzro.TYPE_PHONE);
        sparseArray2.put(5, zzro.TYPE_PRODUCT);
        sparseArray2.put(6, zzro.TYPE_SMS);
        sparseArray2.put(7, zzro.TYPE_TEXT);
        sparseArray2.put(8, zzro.TYPE_URL);
        sparseArray2.put(9, zzro.TYPE_WIFI);
        sparseArray2.put(10, zzro.TYPE_GEO);
        sparseArray2.put(11, zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzro.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f62193wkgbmnqykc = map;
        map.put(1, zzvw.CODE_128);
        map.put(2, zzvw.CODE_39);
        map.put(4, zzvw.CODE_93);
        map.put(8, zzvw.CODABAR);
        map.put(16, zzvw.DATA_MATRIX);
        map.put(32, zzvw.EAN_13);
        map.put(64, zzvw.EAN_8);
        map.put(Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN), zzvw.ITF);
        map.put(Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT), zzvw.QR_CODE);
        map.put(Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE), zzvw.UPC_A);
        map.put(Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL), zzvw.UPC_E);
        map.put(2048, zzvw.PDF417);
        map.put(4096, zzvw.AZTEC);
    }

    static void eablkybsjg(zzwp zzwpVar, final zzrb zzrbVar) {
        zzwpVar.zzf(new zzwo() { // from class: le.iobyxmoadg
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                zzrd zzrdVar = new zzrd();
                zzra zzraVar = zoijcleaow.gxszxtbevo() ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                zzrb zzrbVar2 = zzrbVar;
                zzrdVar.zze(zzraVar);
                zzrs zzrsVar = new zzrs();
                zzrsVar.zzb(zzrbVar2);
                zzrdVar.zzh(zzrsVar.zzc());
                return zzws.zzf(zzrdVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean gxszxtbevo() {
        AtomicReference atomicReference = f62192ppxfxbqfkf;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zZoijcleaow = ojitshcjhn.zoijcleaow(ge.dxjokdxxww.ppxfxbqfkf().zoijcleaow());
        atomicReference.set(Boolean.valueOf(zZoijcleaow));
        return zZoijcleaow;
    }

    public static zzrn iobyxmoadg(int i13) {
        zzrn zzrnVar = (zzrn) f62191iobyxmoadg.get(i13);
        return zzrnVar == null ? zzrn.FORMAT_UNKNOWN : zzrnVar;
    }

    public static zzvz ppxfxbqfkf(ie.zoijcleaow zoijcleaowVar) {
        int iIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        zzcp zzcpVar = new zzcp();
        if (iIobyxmoadg == 0) {
            zzcpVar.zze(f62193wkgbmnqykc.values());
        } else {
            for (Map.Entry entry : f62193wkgbmnqykc.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iIobyxmoadg) != 0) {
                    zzcpVar.zzd((zzvw) entry.getValue());
                }
            }
        }
        zzvx zzvxVar = new zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static String wkgbmnqykc() {
        return true != gxszxtbevo() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static zzro zoijcleaow(int i13) {
        zzro zzroVar = (zzro) f62194zoijcleaow.get(i13);
        return zzroVar == null ? zzro.TYPE_UNKNOWN : zzroVar;
    }
}
