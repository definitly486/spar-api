package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ribwqtqdhb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private CharSequence f12422cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f12423esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CharSequence f12424iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private CharSequence f12425jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private BitmapDrawable f12426lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f12427pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private CharSequence f12428yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private DialogPreference f12429zdlpuopuiu;

    private static class iobyxmoadg {
        static void iobyxmoadg(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void jpowsppfya(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            iobyxmoadg.iobyxmoadg(window);
        } else {
            hkdspvbjdz();
        }
    }

    protected void hcddaimhww(androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
    }

    protected void hkdspvbjdz() {
    }

    public DialogPreference iozdgvuglv() {
        if (this.f12429zdlpuopuiu == null) {
            this.f12429zdlpuopuiu = (DialogPreference) ((DialogPreference.iobyxmoadg) getTargetFragment()).rgvfuqvkyq(requireArguments().getString("key"));
        }
        return this.f12429zdlpuopuiu;
    }

    protected boolean lmojexxdyd() {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i13) {
        this.f12427pmvmpeiblj = i13;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ribwqtqdhb targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.iobyxmoadg)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.iobyxmoadg iobyxmoadgVar = (DialogPreference.iobyxmoadg) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f12428yggfygwlhe = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f12425jyumaefscl = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f12424iwizpuwonk = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f12422cqumvgiudr = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f12423esjtqupxsv = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f12426lereixgezr = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) iobyxmoadgVar.rgvfuqvkyq(string);
        this.f12429zdlpuopuiu = dialogPreference;
        this.f12428yggfygwlhe = dialogPreference.tbqsvytpvh();
        this.f12425jyumaefscl = this.f12429zdlpuopuiu.uawqvzlxes();
        this.f12424iwizpuwonk = this.f12429zdlpuopuiu.roivzttewh();
        this.f12422cqumvgiudr = this.f12429zdlpuopuiu.nuxfzjnpeb();
        this.f12423esjtqupxsv = this.f12429zdlpuopuiu.zeieaojujs();
        Drawable drawableLrnfpwlwnk = this.f12429zdlpuopuiu.lrnfpwlwnk();
        if (drawableLrnfpwlwnk == null || (drawableLrnfpwlwnk instanceof BitmapDrawable)) {
            this.f12426lereixgezr = (BitmapDrawable) drawableLrnfpwlwnk;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableLrnfpwlwnk.getIntrinsicWidth(), drawableLrnfpwlwnk.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableLrnfpwlwnk.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableLrnfpwlwnk.draw(canvas);
        this.f12426lereixgezr = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.f12427pmvmpeiblj = -2;
        androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarGxszxtbevo = new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(requireContext()).setTitle(this.f12428yggfygwlhe).ppxfxbqfkf(this.f12426lereixgezr).dxjokdxxww(this.f12425jyumaefscl, this).gxszxtbevo(this.f12424iwizpuwonk, this);
        View viewYlkuphrtab = ylkuphrtab(requireContext());
        if (viewYlkuphrtab != null) {
            wwaezpbzkn(viewYlkuphrtab);
            iobyxmoadgVarGxszxtbevo.setView(viewYlkuphrtab);
        } else {
            iobyxmoadgVarGxszxtbevo.wkgbmnqykc(this.f12422cqumvgiudr);
        }
        hcddaimhww(iobyxmoadgVarGxszxtbevo);
        androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVarCreate = iobyxmoadgVarGxszxtbevo.create();
        if (lmojexxdyd()) {
            jpowsppfya(ppxfxbqfkfVarCreate);
        }
        return ppxfxbqfkfVarCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        pkzmftpjix(this.f12427pmvmpeiblj == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f12428yggfygwlhe);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f12425jyumaefscl);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f12424iwizpuwonk);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f12422cqumvgiudr);
        bundle.putInt("PreferenceDialogFragment.layout", this.f12423esjtqupxsv);
        BitmapDrawable bitmapDrawable = this.f12426lereixgezr;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public abstract void pkzmftpjix(boolean z13);

    protected void wwaezpbzkn(View view) {
        int i13;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f12422cqumvgiudr;
            if (TextUtils.isEmpty(charSequence)) {
                i13 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i13 = 0;
            }
            if (viewFindViewById.getVisibility() != i13) {
                viewFindViewById.setVisibility(i13);
            }
        }
    }

    protected View ylkuphrtab(Context context) {
        int i13 = this.f12423esjtqupxsv;
        if (i13 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i13, (ViewGroup) null);
    }
}
