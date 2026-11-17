package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.zynmafqrjb;
import modern.payments.ecomAndroid.data.common.MockConstants;

/* JADX INFO: loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f3542cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ImageView f3543esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f3544iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    androidx.biometric.gxszxtbevo f3545jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    TextView f3546lereixgezr;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Handler f3548zdlpuopuiu = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final Runnable f3547yggfygwlhe = new iobyxmoadg();

    private static class eablkybsjg {
        static void iobyxmoadg(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class gxszxtbevo {
        static int iobyxmoadg() {
            return rgvfuqvkyq.zoijcleaow.colorError;
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.pkzmftpjix();
        }
    }

    class ppxfxbqfkf implements zynmafqrjb {
        ppxfxbqfkf() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Integer num) {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            fingerprintDialogFragment.f3548zdlpuopuiu.removeCallbacks(fingerprintDialogFragment.f3547yggfygwlhe);
            FingerprintDialogFragment.this.jpowsppfya(num.intValue());
            FingerprintDialogFragment.this.hkdspvbjdz(num.intValue());
            FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
            fingerprintDialogFragment2.f3548zdlpuopuiu.postDelayed(fingerprintDialogFragment2.f3547yggfygwlhe, MockConstants.TWO_SECONDS_DELAY);
        }
    }

    class wkgbmnqykc implements zynmafqrjb {
        wkgbmnqykc() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(CharSequence charSequence) {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            fingerprintDialogFragment.f3548zdlpuopuiu.removeCallbacks(fingerprintDialogFragment.f3547yggfygwlhe);
            FingerprintDialogFragment.this.cllcsxoeiz(charSequence);
            FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
            fingerprintDialogFragment2.f3548zdlpuopuiu.postDelayed(fingerprintDialogFragment2.f3547yggfygwlhe, MockConstants.TWO_SECONDS_DELAY);
        }
    }

    class zoijcleaow implements DialogInterface.OnClickListener {
        zoijcleaow() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i13) {
            FingerprintDialogFragment.this.f3545jyumaefscl.iyctptxqzt(true);
        }
    }

    private boolean hcddaimhww(int i13, int i14) {
        if (i13 == 0 && i14 == 1) {
            return false;
        }
        if (i13 == 1 && i14 == 2) {
            return true;
        }
        return i13 == 2 && i14 == 1;
    }

    private void iozdgvuglv() {
        oxmwwwfdhm activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.biometric.gxszxtbevo gxszxtbevoVar = (androidx.biometric.gxszxtbevo) new crxdokpmqz(activity).zoijcleaow(androidx.biometric.gxszxtbevo.class);
        this.f3545jyumaefscl = gxszxtbevoVar;
        gxszxtbevoVar.pmvmpeiblj().dxjokdxxww(this, new ppxfxbqfkf());
        this.f3545jyumaefscl.esjtqupxsv().dxjokdxxww(this, new wkgbmnqykc());
    }

    private Drawable lmojexxdyd(int i13, int i14) {
        int i15;
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i13 == 0 && i14 == 1) {
            i15 = rgvfuqvkyq.ppxfxbqfkf.fingerprint_dialog_fp_icon;
        } else if (i13 == 1 && i14 == 2) {
            i15 = rgvfuqvkyq.ppxfxbqfkf.fingerprint_dialog_error;
        } else if (i13 == 2 && i14 == 1) {
            i15 = rgvfuqvkyq.ppxfxbqfkf.fingerprint_dialog_fp_icon;
        } else {
            if (i13 != 1 || i14 != 3) {
                return null;
            }
            i15 = rgvfuqvkyq.ppxfxbqfkf.fingerprint_dialog_fp_icon;
        }
        return androidx.core.content.iobyxmoadg.getDrawable(context, i15);
    }

    private int wwaezpbzkn(int i13) {
        Context context = getContext();
        oxmwwwfdhm activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i13});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    static FingerprintDialogFragment ylkuphrtab() {
        return new FingerprintDialogFragment();
    }

    void cllcsxoeiz(CharSequence charSequence) {
        TextView textView = this.f3546lereixgezr;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void hkdspvbjdz(int i13) {
        TextView textView = this.f3546lereixgezr;
        if (textView != null) {
            textView.setTextColor(i13 == 2 ? this.f3544iwizpuwonk : this.f3542cqumvgiudr);
        }
    }

    void jpowsppfya(int i13) {
        int iLereixgezr;
        Drawable drawableLmojexxdyd;
        if (this.f3543esjtqupxsv == null || (drawableLmojexxdyd = lmojexxdyd((iLereixgezr = this.f3545jyumaefscl.lereixgezr()), i13)) == null) {
            return;
        }
        this.f3543esjtqupxsv.setImageDrawable(drawableLmojexxdyd);
        if (hcddaimhww(iLereixgezr, i13)) {
            eablkybsjg.iobyxmoadg(drawableLmojexxdyd);
        }
        this.f3545jyumaefscl.oipsdeybqn(i13);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f3545jyumaefscl.ydmasvzmpa(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iozdgvuglv();
        this.f3544iwizpuwonk = wwaezpbzkn(gxszxtbevo.iobyxmoadg());
        this.f3542cqumvgiudr = wwaezpbzkn(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(requireContext());
        iobyxmoadgVar.setTitle(this.f3545jyumaefscl.cllcsxoeiz());
        View viewInflate = LayoutInflater.from(iobyxmoadgVar.getContext()).inflate(rgvfuqvkyq.eablkybsjg.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(rgvfuqvkyq.wkgbmnqykc.fingerprint_subtitle);
        if (textView != null) {
            CharSequence charSequenceJpowsppfya = this.f3545jyumaefscl.jpowsppfya();
            if (TextUtils.isEmpty(charSequenceJpowsppfya)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceJpowsppfya);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(rgvfuqvkyq.wkgbmnqykc.fingerprint_description);
        if (textView2 != null) {
            CharSequence charSequenceCqumvgiudr = this.f3545jyumaefscl.cqumvgiudr();
            if (TextUtils.isEmpty(charSequenceCqumvgiudr)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceCqumvgiudr);
            }
        }
        this.f3543esjtqupxsv = (ImageView) viewInflate.findViewById(rgvfuqvkyq.wkgbmnqykc.fingerprint_icon);
        this.f3546lereixgezr = (TextView) viewInflate.findViewById(rgvfuqvkyq.wkgbmnqykc.fingerprint_error);
        iobyxmoadgVar.gxszxtbevo(androidx.biometric.zoijcleaow.ppxfxbqfkf(this.f3545jyumaefscl.gtknphoqwx()) ? getString(rgvfuqvkyq.gxszxtbevo.confirm_device_credential_password) : this.f3545jyumaefscl.pkzmftpjix(), new zoijcleaow());
        iobyxmoadgVar.setView(viewInflate);
        androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVarCreate = iobyxmoadgVar.create();
        ppxfxbqfkfVarCreate.setCanceledOnTouchOutside(false);
        return ppxfxbqfkfVarCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f3548zdlpuopuiu.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f3545jyumaefscl.oipsdeybqn(0);
        this.f3545jyumaefscl.bfopjjpdmp(1);
        this.f3545jyumaefscl.zfvoamnweg(getString(rgvfuqvkyq.gxszxtbevo.fingerprint_dialog_touch_sensor));
    }

    void pkzmftpjix() {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f3545jyumaefscl.bfopjjpdmp(1);
            this.f3545jyumaefscl.zfvoamnweg(context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_dialog_touch_sensor));
        }
    }
}
