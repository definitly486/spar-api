package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static nufgyqmvbu f3369ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final PorterDuff.Mode f3370zoijcleaow = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private jpowsppfya f3371iobyxmoadg;

    class iobyxmoadg implements jpowsppfya.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int[] f3374iobyxmoadg = {lqeggnwhkg.eablkybsjg.abc_textfield_search_default_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_textfield_default_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f3377zoijcleaow = {lqeggnwhkg.eablkybsjg.abc_ic_commit_search_api_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_seekbar_tick_mark_material, lqeggnwhkg.eablkybsjg.abc_ic_menu_share_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_ic_menu_copy_mtrl_am_alpha, lqeggnwhkg.eablkybsjg.abc_ic_menu_cut_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_ic_menu_selectall_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int[] f3375ppxfxbqfkf = {lqeggnwhkg.eablkybsjg.abc_textfield_activated_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_textfield_search_activated_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_cab_background_top_mtrl_alpha, lqeggnwhkg.eablkybsjg.abc_text_cursor_material, lqeggnwhkg.eablkybsjg.abc_text_select_handle_left_mtrl, lqeggnwhkg.eablkybsjg.abc_text_select_handle_middle_mtrl, lqeggnwhkg.eablkybsjg.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int[] f3376wkgbmnqykc = {lqeggnwhkg.eablkybsjg.abc_popup_background_mtrl_mult, lqeggnwhkg.eablkybsjg.abc_cab_background_internal_bg, lqeggnwhkg.eablkybsjg.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int[] f3372eablkybsjg = {lqeggnwhkg.eablkybsjg.abc_tab_indicator_material, lqeggnwhkg.eablkybsjg.abc_textfield_search_material};

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int[] f3373gxszxtbevo = {lqeggnwhkg.eablkybsjg.abc_btn_check_material, lqeggnwhkg.eablkybsjg.abc_btn_radio_material, lqeggnwhkg.eablkybsjg.abc_btn_check_material_anim, lqeggnwhkg.eablkybsjg.abc_btn_radio_material_anim};

        iobyxmoadg() {
        }

        private ColorStateList btonecajqb(Context context) {
            return nufgyqmvbu(context, wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorButtonNormal));
        }

        private LayerDrawable draadjrbmk(jpowsppfya jpowsppfyaVar, Context context, int i13) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i13);
            Drawable drawableDxjokdxxww = jpowsppfyaVar.dxjokdxxww(context, lqeggnwhkg.eablkybsjg.abc_star_black_48dp);
            Drawable drawableDxjokdxxww2 = jpowsppfyaVar.dxjokdxxww(context, lqeggnwhkg.eablkybsjg.abc_star_half_black_48dp);
            if ((drawableDxjokdxxww instanceof BitmapDrawable) && drawableDxjokdxxww.getIntrinsicWidth() == dimensionPixelSize && drawableDxjokdxxww.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableDxjokdxxww;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableDxjokdxxww.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableDxjokdxxww.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableDxjokdxxww2 instanceof BitmapDrawable) && drawableDxjokdxxww2.getIntrinsicWidth() == dimensionPixelSize && drawableDxjokdxxww2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableDxjokdxxww2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableDxjokdxxww2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableDxjokdxxww2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private ColorStateList dxjokdxxww(Context context) {
            return nufgyqmvbu(context, wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorAccent));
        }

        private ColorStateList gtknphoqwx(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListEablkybsjg = wypolnanlu.eablkybsjg(context, lqeggnwhkg.iobyxmoadg.colorSwitchThumbNormal);
            if (colorStateListEablkybsjg == null || !colorStateListEablkybsjg.isStateful()) {
                iArr[0] = wypolnanlu.f3434zoijcleaow;
                iArr2[0] = wypolnanlu.zoijcleaow(context, lqeggnwhkg.iobyxmoadg.colorSwitchThumbNormal);
                iArr[1] = wypolnanlu.f3428gxszxtbevo;
                iArr2[1] = wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlActivated);
                iArr[2] = wypolnanlu.f3426dxjokdxxww;
                iArr2[2] = wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = wypolnanlu.f3434zoijcleaow;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListEablkybsjg.getColorForState(iArr3, 0);
                iArr[1] = wypolnanlu.f3428gxszxtbevo;
                iArr2[1] = wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlActivated);
                iArr[2] = wypolnanlu.f3426dxjokdxxww;
                iArr2[2] = colorStateListEablkybsjg.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private boolean gxszxtbevo(int[] iArr, int i13) {
            for (int i14 : iArr) {
                if (i14 == i13) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList lqeggnwhkg(Context context) {
            return nufgyqmvbu(context, 0);
        }

        private ColorStateList nufgyqmvbu(Context context, int i13) {
            int iPpxfxbqfkf = wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlHighlight);
            return new ColorStateList(new int[][]{wypolnanlu.f3434zoijcleaow, wypolnanlu.f3427eablkybsjg, wypolnanlu.f3432ppxfxbqfkf, wypolnanlu.f3426dxjokdxxww}, new int[]{wypolnanlu.zoijcleaow(context, lqeggnwhkg.iobyxmoadg.colorButtonNormal), j1.ppxfxbqfkf.lqeggnwhkg(iPpxfxbqfkf, i13), j1.ppxfxbqfkf.lqeggnwhkg(iPpxfxbqfkf, i13), i13});
        }

        private void wflxmlrfwp(Drawable drawable, int i13, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = nufgyqmvbu.f3370zoijcleaow;
            }
            drawableMutate.setColorFilter(nufgyqmvbu.eablkybsjg(i13, mode));
        }

        @Override // androidx.appcompat.widget.jpowsppfya.ppxfxbqfkf
        public boolean eablkybsjg(Context context, int i13, Drawable drawable) {
            if (i13 == lqeggnwhkg.eablkybsjg.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                wflxmlrfwp(layerDrawable.findDrawableByLayerId(R.id.background), wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlNormal), nufgyqmvbu.f3370zoijcleaow);
                wflxmlrfwp(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlNormal), nufgyqmvbu.f3370zoijcleaow);
                wflxmlrfwp(layerDrawable.findDrawableByLayerId(R.id.progress), wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlActivated), nufgyqmvbu.f3370zoijcleaow);
                return true;
            }
            if (i13 != lqeggnwhkg.eablkybsjg.abc_ratingbar_material && i13 != lqeggnwhkg.eablkybsjg.abc_ratingbar_indicator_material && i13 != lqeggnwhkg.eablkybsjg.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            wflxmlrfwp(layerDrawable2.findDrawableByLayerId(R.id.background), wypolnanlu.zoijcleaow(context, lqeggnwhkg.iobyxmoadg.colorControlNormal), nufgyqmvbu.f3370zoijcleaow);
            wflxmlrfwp(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlActivated), nufgyqmvbu.f3370zoijcleaow);
            wflxmlrfwp(layerDrawable2.findDrawableByLayerId(R.id.progress), wypolnanlu.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorControlActivated), nufgyqmvbu.f3370zoijcleaow);
            return true;
        }

        @Override // androidx.appcompat.widget.jpowsppfya.ppxfxbqfkf
        public Drawable iobyxmoadg(jpowsppfya jpowsppfyaVar, Context context, int i13) {
            if (i13 == lqeggnwhkg.eablkybsjg.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{jpowsppfyaVar.dxjokdxxww(context, lqeggnwhkg.eablkybsjg.abc_cab_background_internal_bg), jpowsppfyaVar.dxjokdxxww(context, lqeggnwhkg.eablkybsjg.abc_cab_background_top_mtrl_alpha)});
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_ratingbar_material) {
                return draadjrbmk(jpowsppfyaVar, context, lqeggnwhkg.wkgbmnqykc.abc_star_big);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_ratingbar_indicator_material) {
                return draadjrbmk(jpowsppfyaVar, context, lqeggnwhkg.wkgbmnqykc.abc_star_medium);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_ratingbar_small_material) {
                return draadjrbmk(jpowsppfyaVar, context, lqeggnwhkg.wkgbmnqykc.abc_star_small);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0062  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.jpowsppfya.ppxfxbqfkf
        public boolean ppxfxbqfkf(Context context, int i13, Drawable drawable) {
            int i14;
            boolean z13;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = nufgyqmvbu.f3370zoijcleaow;
            if (!gxszxtbevo(this.f3374iobyxmoadg, i13)) {
                if (gxszxtbevo(this.f3375ppxfxbqfkf, i13)) {
                    i14 = lqeggnwhkg.iobyxmoadg.colorControlActivated;
                } else {
                    if (gxszxtbevo(this.f3376wkgbmnqykc, i13)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i13 == lqeggnwhkg.eablkybsjg.abc_list_divider_mtrl_alpha) {
                        z13 = true;
                        iRound = Math.round(40.8f);
                        i14 = 16842800;
                        mode = mode;
                    } else if (i13 != lqeggnwhkg.eablkybsjg.abc_dialog_material_background) {
                        i14 = 0;
                        z13 = false;
                        iRound = -1;
                    }
                    mode = mode;
                    iRound = -1;
                    i14 = 16842801;
                    z13 = true;
                }
                if (z13) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(nufgyqmvbu.eablkybsjg(wypolnanlu.ppxfxbqfkf(context, i14), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i14 = lqeggnwhkg.iobyxmoadg.colorControlNormal;
            z13 = true;
            iRound = -1;
            if (z13) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(nufgyqmvbu.eablkybsjg(wypolnanlu.ppxfxbqfkf(context, i14), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.jpowsppfya.ppxfxbqfkf
        public PorterDuff.Mode wkgbmnqykc(int i13) {
            if (i13 == lqeggnwhkg.eablkybsjg.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.jpowsppfya.ppxfxbqfkf
        public ColorStateList zoijcleaow(Context context, int i13) {
            if (i13 == lqeggnwhkg.eablkybsjg.abc_edit_text_material) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_edittext);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_switch_track_mtrl_alpha) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_switch_track);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_switch_thumb_material) {
                return gtknphoqwx(context);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_btn_default_mtrl_shape) {
                return btonecajqb(context);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_btn_borderless_material) {
                return lqeggnwhkg(context);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_btn_colored_material) {
                return dxjokdxxww(context);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_spinner_mtrl_am_alpha || i13 == lqeggnwhkg.eablkybsjg.abc_spinner_textfield_background_material) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_spinner);
            }
            if (gxszxtbevo(this.f3377zoijcleaow, i13)) {
                return wypolnanlu.eablkybsjg(context, lqeggnwhkg.iobyxmoadg.colorControlNormal);
            }
            if (gxszxtbevo(this.f3372eablkybsjg, i13)) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_default);
            }
            if (gxszxtbevo(this.f3373gxszxtbevo, i13)) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_btn_checkable);
            }
            if (i13 == lqeggnwhkg.eablkybsjg.abc_seekbar_thumb_material) {
                return nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, lqeggnwhkg.ppxfxbqfkf.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    static void dxjokdxxww(Drawable drawable, kegysxyocb kegysxyocbVar, int[] iArr) {
        jpowsppfya.jyumaefscl(drawable, kegysxyocbVar, iArr);
    }

    public static synchronized PorterDuffColorFilter eablkybsjg(int i13, PorterDuff.Mode mode) {
        return jpowsppfya.gtknphoqwx(i13, mode);
    }

    public static synchronized void nufgyqmvbu() {
        if (f3369ppxfxbqfkf == null) {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu();
            f3369ppxfxbqfkf = nufgyqmvbuVar;
            nufgyqmvbuVar.f3371iobyxmoadg = jpowsppfya.lqeggnwhkg();
            f3369ppxfxbqfkf.f3371iobyxmoadg.zdlpuopuiu(new iobyxmoadg());
        }
    }

    public static synchronized nufgyqmvbu zoijcleaow() {
        try {
            if (f3369ppxfxbqfkf == null) {
                nufgyqmvbu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3369ppxfxbqfkf;
    }

    synchronized ColorStateList gxszxtbevo(Context context, int i13) {
        return this.f3371iobyxmoadg.draadjrbmk(context, i13);
    }

    public synchronized void lqeggnwhkg(Context context) {
        this.f3371iobyxmoadg.oxmwwwfdhm(context);
    }

    public synchronized Drawable ppxfxbqfkf(Context context, int i13) {
        return this.f3371iobyxmoadg.dxjokdxxww(context, i13);
    }

    synchronized Drawable wkgbmnqykc(Context context, int i13, boolean z13) {
        return this.f3371iobyxmoadg.btonecajqb(context, i13, z13);
    }
}
