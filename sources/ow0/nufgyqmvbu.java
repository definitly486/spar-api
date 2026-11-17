package ow0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final zoijcleaow f74832hcddaimhww = new zoijcleaow(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final int f74833jpowsppfya = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private String f74834cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f74835esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private dxjokdxxww f74836iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private String f74837istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f74838lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f74839lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f74840pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Integer f74841pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private ow0.ppxfxbqfkf f74842wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private String f74843yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final List f74844ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Integer f74845zynmafqrjb;

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f74847iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f74848zoijcleaow;

        static {
            int[] iArr = new int[ow0.ppxfxbqfkf.values().length];
            try {
                iArr[ow0.ppxfxbqfkf.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ow0.ppxfxbqfkf.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f74847iobyxmoadg = iArr;
            int[] iArr2 = new int[ow0.zoijcleaow.values().length];
            try {
                iArr2[ow0.zoijcleaow.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ow0.zoijcleaow.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f74848zoijcleaow = iArr2;
        }
    }

    public static final class wkgbmnqykc implements Comparator {
        public wkgbmnqykc() {
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            boolean z13;
            ow0.iobyxmoadg iobyxmoadgVar = (ow0.iobyxmoadg) obj;
            ow0.ppxfxbqfkf ppxfxbqfkfVar = nufgyqmvbu.this.f74842wwaezpbzkn;
            int[] iArr = ppxfxbqfkf.f74847iobyxmoadg;
            int i13 = iArr[ppxfxbqfkfVar.ordinal()];
            boolean z14 = false;
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (iobyxmoadgVar.wkgbmnqykc() == ow0.zoijcleaow.PRIMARY) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else if (iobyxmoadgVar.wkgbmnqykc() == ow0.zoijcleaow.SECONDARY) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z13);
            ow0.iobyxmoadg iobyxmoadgVar2 = (ow0.iobyxmoadg) obj2;
            int i14 = iArr[nufgyqmvbu.this.f74842wwaezpbzkn.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (iobyxmoadgVar2.wkgbmnqykc() == ow0.zoijcleaow.PRIMARY) {
                    z14 = true;
                }
            } else if (iobyxmoadgVar2.wkgbmnqykc() == ow0.zoijcleaow.SECONDARY) {
                z14 = true;
            }
            return kg.iobyxmoadg.wkgbmnqykc(boolValueOf, Boolean.valueOf(z14));
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f74835esjtqupxsv = iobyxmoadgVar;
        this.f74838lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ow0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.yggfygwlhe(this.f74854zdlpuopuiu);
            }
        });
        this.f74842wwaezpbzkn = ow0.ppxfxbqfkf.HORIZONTAL;
        this.f74844ylkuphrtab = new ArrayList();
        this.f74840pkzmftpjix = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, iwizpuwonk(), 0, bool != null ? bool.booleanValue() : false, false, 21, null);
    }

    private final void cdpycssgdh(String str) {
        ShapeableImageView shapeableImageView = jyumaefscl().f72042wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(shapeableImageView);
        p41.eablkybsjg.lqeggnwhkg(shapeableImageView, str, 500);
        shapeableImageView.setVisibility(0);
    }

    private final int cqumvgiudr() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(tg.iobyxmoadg iobyxmoadgVar, DialogInterface dialogInterface) {
        iobyxmoadgVar.invoke();
    }

    private final void iozdgvuglv(CharSequence charSequence) {
        MaterialTextView materialTextView = jyumaefscl().f72038gxszxtbevo;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(nufgyqmvbu nufgyqmvbuVar, View view) {
        nufgyqmvbuVar.dismiss();
    }

    private final int iwizpuwonk() {
        int iCqumvgiudr = cqumvgiudr();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iCqumvgiudr - (wr0.iobyxmoadg.iobyxmoadg(45, context) * 2);
    }

    private final o41.zoijcleaow jyumaefscl() {
        return (o41.zoijcleaow) this.f74838lereixgezr.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    private final void lereixgezr() {
        int i13;
        int i14;
        CharSequence charSequenceZoijcleaow;
        LinearLayout linearLayout = jyumaefscl().f72037eablkybsjg;
        int i15 = ppxfxbqfkf.f74847iobyxmoadg[this.f74842wwaezpbzkn.ordinal()];
        int i16 = 0;
        if (i15 == 1) {
            i13 = 1;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 0;
        }
        linearLayout.setOrientation(i13);
        if (this.f74844ylkuphrtab.isEmpty()) {
            return;
        }
        List listD = jyumaefscl.d(this.f74844ylkuphrtab, new wkgbmnqykc());
        this.f74844ylkuphrtab.clear();
        this.f74844ylkuphrtab.addAll(listD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        for (Object obj : this.f74844ylkuphrtab) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            final ow0.iobyxmoadg iobyxmoadgVar = (ow0.iobyxmoadg) obj;
            int i18 = ppxfxbqfkf.f74848zoijcleaow[iobyxmoadgVar.wkgbmnqykc().ordinal()];
            if (i18 == 1) {
                i14 = b31.ppxfxbqfkf.customDialogSecondaryButton;
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = b31.ppxfxbqfkf.customDialogPrimaryButton;
            }
            MaterialButton materialButton = new MaterialButton(getContext(), null, i14);
            materialButton.setId(i16);
            Integer numPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (numPpxfxbqfkf != null) {
                charSequenceZoijcleaow = materialButton.getResources().getText(numPpxfxbqfkf.intValue());
                if (charSequenceZoijcleaow == null) {
                    charSequenceZoijcleaow = iobyxmoadgVar.zoijcleaow();
                    if (charSequenceZoijcleaow == null) {
                        charSequenceZoijcleaow = "";
                    }
                }
            } else {
                charSequenceZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (charSequenceZoijcleaow == null) {
                    charSequenceZoijcleaow = "";
                }
            }
            materialButton.setText(charSequenceZoijcleaow);
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: ow0.lqeggnwhkg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nufgyqmvbu.pmvmpeiblj(iobyxmoadgVar, this, view);
                }
            });
            materialButton.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = jyumaefscl().f72037eablkybsjg;
            linearLayout2.addView(materialButton);
            if (this.f74844ylkuphrtab.size() != 1 && i16 < this.f74844ylkuphrtab.size() - 1) {
                Space space = new Space(linearLayout2.getContext());
                int dimensionPixelSize = space.getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_16);
                space.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                linearLayout2.addView(space);
            }
            i16 = i17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(ow0.iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar, View view) {
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (iobyxmoadgVarIobyxmoadg != null) {
            iobyxmoadgVarIobyxmoadg.invoke();
        }
        nufgyqmvbuVar.dismiss();
    }

    private final void yadqdtsiqt(dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar.ppxfxbqfkf() != null) {
            jyumaefscl().f72042wkgbmnqykc.setScaleType(dxjokdxxwwVar.ppxfxbqfkf());
        }
        if (dxjokdxxwwVar.iobyxmoadg() != null) {
            ShapeableImageView shapeableImageView = jyumaefscl().f72042wkgbmnqykc;
            shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().jyumaefscl().vdvldrhtss(0, dxjokdxxwwVar.iobyxmoadg().floatValue()).wflxmlrfwp());
        }
        if (dxjokdxxwwVar.wkgbmnqykc() == null && dxjokdxxwwVar.zoijcleaow() == null) {
            return;
        }
        ShapeableImageView shapeableImageView2 = jyumaefscl().f72042wkgbmnqykc;
        ViewGroup.LayoutParams layoutParams = shapeableImageView2.getLayoutParams();
        if (dxjokdxxwwVar.wkgbmnqykc() != null) {
            int iIntValue = dxjokdxxwwVar.wkgbmnqykc().intValue();
            Context context = shapeableImageView2.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            layoutParams.width = wr0.iobyxmoadg.iobyxmoadg(iIntValue, context);
        }
        if (dxjokdxxwwVar.zoijcleaow() != null) {
            int iIntValue2 = dxjokdxxwwVar.zoijcleaow().intValue();
            Context context2 = shapeableImageView2.getContext();
            zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
            layoutParams.height = wr0.iobyxmoadg.iobyxmoadg(iIntValue2, context2);
        }
        shapeableImageView2.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o41.zoijcleaow yggfygwlhe(nufgyqmvbu nufgyqmvbuVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.core.ui.databinding.DialogCustomProloyaltyBinding");
        return (o41.zoijcleaow) iobyxmoadgVarPpxfxbqfkf;
    }

    private final void zynmafqrjb() {
        ImageView imageView = jyumaefscl().f72043zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(imageView);
        imageView.setVisibility(this.f74839lmojexxdyd ? 0 : 8);
        if (this.f74839lmojexxdyd) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ow0.gxszxtbevo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nufgyqmvbu.istkbnxepw(this.f74825zdlpuopuiu, view);
                }
            });
        }
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer num = this.f74841pmvmpeiblj;
        if (num != null) {
            jyumaefscl().f72040lqeggnwhkg.setGravity(num.intValue());
        }
        Integer num2 = this.f74845zynmafqrjb;
        if (num2 != null) {
            jyumaefscl().f72038gxszxtbevo.setGravity(num2.intValue());
        }
        String str = this.f74837istkbnxepw;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.f74834cdpycssgdh;
        if (str2 != null) {
            iozdgvuglv(str2);
        }
        dxjokdxxww dxjokdxxwwVar = this.f74836iozdgvuglv;
        if (dxjokdxxwwVar != null) {
            yadqdtsiqt(dxjokdxxwwVar);
        }
        String str3 = this.f74843yadqdtsiqt;
        if (str3 != null) {
            cdpycssgdh(str3);
        }
        final tg.iobyxmoadg iobyxmoadgVar = this.f74835esjtqupxsv;
        if (iobyxmoadgVar != null) {
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ow0.eablkybsjg
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    nufgyqmvbu.esjtqupxsv(iobyxmoadgVar, dialogInterface);
                }
            });
        }
        zynmafqrjb();
        lereixgezr();
        jyumaefscl();
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f74840pkzmftpjix;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public o41.zoijcleaow iobyxmoadg() {
        o41.zoijcleaow zoijcleaowVarPpxfxbqfkf = o41.zoijcleaow.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f74846iobyxmoadg;

        public iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f74846iobyxmoadg = new nufgyqmvbu(context, bool, iobyxmoadgVar);
        }

        public static /* synthetic */ iobyxmoadg gtknphoqwx(iobyxmoadg iobyxmoadgVar, int i13, tg.iobyxmoadg iobyxmoadgVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                iobyxmoadgVar2 = null;
            }
            return iobyxmoadgVar.btonecajqb(i13, iobyxmoadgVar2);
        }

        public static /* synthetic */ iobyxmoadg wflxmlrfwp(iobyxmoadg iobyxmoadgVar, int i13, tg.iobyxmoadg iobyxmoadgVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                iobyxmoadgVar2 = null;
            }
            return iobyxmoadgVar.draadjrbmk(i13, iobyxmoadgVar2);
        }

        public final iobyxmoadg agtfadlqog(int i13) {
            nufgyqmvbu nufgyqmvbuVar = this.f74846iobyxmoadg;
            nufgyqmvbuVar.f74837istkbnxepw = nufgyqmvbuVar.getContext().getString(i13);
            return this;
        }

        public final iobyxmoadg btonecajqb(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadg(new ow0.iobyxmoadg(ow0.zoijcleaow.SECONDARY, Integer.valueOf(i13), null, iobyxmoadgVar, 4, null));
            return this;
        }

        public final iobyxmoadg draadjrbmk(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadg(new ow0.iobyxmoadg(ow0.zoijcleaow.PRIMARY, Integer.valueOf(i13), null, iobyxmoadgVar, 4, null));
            return this;
        }

        public final iobyxmoadg dxjokdxxww(int i13) {
            this.f74846iobyxmoadg.f74845zynmafqrjb = Integer.valueOf(i13);
            return this;
        }

        public final iobyxmoadg eablkybsjg(String imageSource) {
            zdlpuopuiu.btonecajqb(imageSource, "imageSource");
            this.f74846iobyxmoadg.f74843yadqdtsiqt = imageSource;
            return this;
        }

        public final iobyxmoadg gxszxtbevo(dxjokdxxww imageTransformer) {
            zdlpuopuiu.btonecajqb(imageTransformer, "imageTransformer");
            this.f74846iobyxmoadg.f74836iozdgvuglv = imageTransformer;
            return this;
        }

        public final iobyxmoadg iobyxmoadg(ow0.iobyxmoadg button) {
            zdlpuopuiu.btonecajqb(button, "button");
            this.f74846iobyxmoadg.f74844ylkuphrtab.add(button);
            return this;
        }

        public final iobyxmoadg lqeggnwhkg(int i13) {
            nufgyqmvbu nufgyqmvbuVar = this.f74846iobyxmoadg;
            nufgyqmvbuVar.f74834cdpycssgdh = nufgyqmvbuVar.getContext().getString(i13);
            return this;
        }

        public final iobyxmoadg nufgyqmvbu(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f74846iobyxmoadg.f74834cdpycssgdh = message;
            return this;
        }

        public final iobyxmoadg ojitshcjhn(String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.f74846iobyxmoadg.f74837istkbnxepw = title;
            return this;
        }

        public final iobyxmoadg ppxfxbqfkf(ow0.ppxfxbqfkf type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f74846iobyxmoadg.f74842wwaezpbzkn = type;
            return this;
        }

        public final iobyxmoadg rgvfuqvkyq(int i13) {
            this.f74846iobyxmoadg.f74841pmvmpeiblj = Integer.valueOf(i13);
            return this;
        }

        public final iobyxmoadg vdvldrhtss() {
            this.f74846iobyxmoadg.f74839lmojexxdyd = true;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(boolean z13) {
            this.f74846iobyxmoadg.setCancelable(z13);
            return this;
        }

        public final nufgyqmvbu zoijcleaow() {
            return this.f74846iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = jyumaefscl().f72040lqeggnwhkg;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }
}
