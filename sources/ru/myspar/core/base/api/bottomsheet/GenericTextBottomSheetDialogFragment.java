package ru.myspar.core.base.api.bottomsheet;

import ah.gtknphoqwx;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import da.gxszxtbevo;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.GenericTextBottomSheetDialogFragment;
import s40.dxjokdxxww;
import tg.draadjrbmk;
import ys.iobyxmoadg;
import ys.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/myspar/core/base/api/bottomsheet/GenericTextBottomSheetDialogFragment;", "Lru/myspar/core/base/api/bottomsheet/FixedBottomSheetFragment;", "<init>", "()V", "Lru/myspar/core/base/api/bottomsheet/GenericTextBottomSheetDialogFragment$GenericTextBottomSheetArgs;", "args", "Lgg/wwaezpbzkn;", "ribwqtqdhb", "(Lru/myspar/core/base/api/bottomsheet/GenericTextBottomSheetDialogFragment$GenericTextBottomSheetArgs;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "crxdokpmqz", "Lb60/ppxfxbqfkf;", "esjtqupxsv", "Lys/ppxfxbqfkf;", "sopmlzcsov", "()Lb60/ppxfxbqfkf;", "binding", "lereixgezr", "iobyxmoadg", "GenericTextBottomSheetArgs", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenericTextBottomSheetDialogFragment extends FixedBottomSheetFragment {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf binding;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f86504pmvmpeiblj = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(GenericTextBottomSheetDialogFragment.class, "binding", "getBinding()Lru/myspar/core/ui/databinding/DialogGenericTextBottomSheetBinding;", 0))};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f86505zynmafqrjb = ppxfxbqfkf.f126314ppxfxbqfkf;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/core/base/api/bottomsheet/GenericTextBottomSheetDialogFragment$GenericTextBottomSheetArgs;", "Landroid/os/Parcelable;", "", "header", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericTextBottomSheetArgs implements Parcelable {
        public static final Parcelable.Creator<GenericTextBottomSheetArgs> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String header;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final GenericTextBottomSheetArgs createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new GenericTextBottomSheetArgs(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final GenericTextBottomSheetArgs[] newArray(int i13) {
                return new GenericTextBottomSheetArgs[i13];
            }
        }

        public GenericTextBottomSheetArgs(String header, String message) {
            zdlpuopuiu.btonecajqb(header, "header");
            zdlpuopuiu.btonecajqb(message, "message");
            this.header = header;
            this.message = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenericTextBottomSheetArgs)) {
                return false;
            }
            GenericTextBottomSheetArgs genericTextBottomSheetArgs = (GenericTextBottomSheetArgs) other;
            return zdlpuopuiu.eablkybsjg(this.header, genericTextBottomSheetArgs.header) && zdlpuopuiu.eablkybsjg(this.message, genericTextBottomSheetArgs.message);
        }

        public int hashCode() {
            return (this.header.hashCode() * 31) + this.message.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public String toString() {
            return "GenericTextBottomSheetArgs(header=" + this.header + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.header);
            dest.writeString(this.message);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getHeader() {
            return this.header;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.core.base.api.bottomsheet.GenericTextBottomSheetDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final GenericTextBottomSheetDialogFragment iobyxmoadg(GenericTextBottomSheetArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            GenericTextBottomSheetDialogFragment genericTextBottomSheetDialogFragment = new GenericTextBottomSheetDialogFragment();
            genericTextBottomSheetDialogFragment.setArguments(qs.ppxfxbqfkf.zoijcleaow(genericTextBottomSheetDialogFragment, args, null, 2, null));
            return genericTextBottomSheetDialogFragment;
        }

        private Companion() {
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f86509zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, b60.ppxfxbqfkf.class, "bind", "bind(Landroid/view/View;)Lru/myspar/core/ui/databinding/DialogGenericTextBottomSheetBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final b60.ppxfxbqfkf invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return b60.ppxfxbqfkf.iobyxmoadg(p13);
        }
    }

    public GenericTextBottomSheetDialogFragment() {
        super(dxjokdxxww.dialog_generic_text_bottom_sheet);
        this.binding = iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f86509zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(s40.gxszxtbevo.bottom_sheet_background);
        }
    }

    private final void ribwqtqdhb(GenericTextBottomSheetArgs args) {
        b60.ppxfxbqfkf ppxfxbqfkfVarSopmlzcsov = sopmlzcsov();
        ppxfxbqfkfVarSopmlzcsov.f15359ppxfxbqfkf.setText(args.getHeader());
        ppxfxbqfkfVarSopmlzcsov.f15360wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(args.getMessage(), 0, null, null));
    }

    private final b60.ppxfxbqfkf sopmlzcsov() {
        return (b60.ppxfxbqfkf) this.binding.iobyxmoadg(this, f86504pmvmpeiblj[0]);
    }

    public final void crxdokpmqz() {
        sopmlzcsov().f15360wkgbmnqykc.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qx.zoijcleaow
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                GenericTextBottomSheetDialogFragment.jlmebxxoox(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        crxdokpmqz();
        ribwqtqdhb((GenericTextBottomSheetArgs) qs.ppxfxbqfkf.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(GenericTextBottomSheetArgs.class)));
    }
}
