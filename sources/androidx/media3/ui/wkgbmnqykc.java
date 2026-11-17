package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends FrameLayout {

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private static final float[] f11901ezmngbhpjk;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private int f11902ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private v2.esjtqupxsv f11903auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private final String f11904bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final PopupWindow f11905cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final ImageView f11906cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final RecyclerView f11907cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final lmojexxdyd f11908crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private final String f11909czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final ImageView f11910dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private boolean f11911dvvnrvtcbc;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final nufgyqmvbu f11912esjtqupxsv;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private int f11913fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private boolean f11914fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private int f11915fyldjkxazc;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    private boolean[] f11916grlcpdaxtj;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final TextView f11917hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final ImageView f11918hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private boolean f11919hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private boolean f11920igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private final Runnable f11921ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final ImageView f11922iozdgvuglv;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private long[] f11923ipoelvxyzq;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final d5.yadqdtsiqt f11924istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CopyOnWriteArrayList f11925iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private InterfaceC0170wkgbmnqykc f11926iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private boolean[] f11927ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private final Drawable f11928iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f11929jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final StringBuilder f11930jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final TextView f11931jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private long f11932jrbgnlbqoe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ppxfxbqfkf f11933jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private final Drawable f11934jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final ImageView f11935kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final eablkybsjg f11936lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final ImageView f11937lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private final String f11938lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private boolean f11939lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final View f11940mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private final Drawable f11941metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    private long[] f11942mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final View f11943ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private final Drawable f11944nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private final float f11945oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private final Drawable f11946okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private final String f11947opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final View f11948pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final btonecajqb f11949pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private final Formatter f11950ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final Drawable f11951rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private final String f11952roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private final Drawable f11953sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private boolean f11954skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final TextView f11955sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final ImageView f11956stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private final Drawable f11957tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final View f11958tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private final String f11959uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final TextView f11960ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private final String f11961uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f11962vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private final Drawable f11963weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private boolean f11964wizcaqwiak;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final ImageView f11965wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final ImageView f11966wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private final Drawable f11967xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final int f11968yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private final Drawable f11969ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private final String f11970yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Resources f11971yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final View f11972ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iwizpuwonk f11973zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private final String f11974zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private final float f11975zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final zoijcleaow f11976zynmafqrjb;

    /* JADX INFO: Access modifiers changed from: private */
    final class btonecajqb extends draadjrbmk {
        private btonecajqb() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(View view) {
            if (wkgbmnqykc.this.f11903auzgnhcxok == null || !wkgbmnqykc.this.f11903auzgnhcxok.kcexrzcfyt(29)) {
                return;
            }
            wkgbmnqykc.this.f11903auzgnhcxok.yadqdtsiqt(wkgbmnqykc.this.f11903auzgnhcxok.cqumvgiudr().iobyxmoadg().lmojexxdyd(3).hcddaimhww(-3).hkdspvbjdz(null).dsvhmnatus(0).iozdgvuglv());
            wkgbmnqykc.this.f11905cdpycssgdh.dismiss();
        }

        @Override // androidx.media3.ui.wkgbmnqykc.draadjrbmk
        public void dxjokdxxww(String str) {
        }

        public void gtknphoqwx(List list) {
            boolean z13 = false;
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (((gtknphoqwx) list.get(i13)).iobyxmoadg()) {
                    z13 = true;
                    break;
                }
            }
            if (wkgbmnqykc.this.f11966wypolnanlu != null) {
                ImageView imageView = wkgbmnqykc.this.f11966wypolnanlu;
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                imageView.setImageDrawable(z13 ? wkgbmnqykcVar.f11928iyctptxqzt : wkgbmnqykcVar.f11963weqkydbzbr);
                wkgbmnqykc.this.f11966wypolnanlu.setContentDescription(z13 ? wkgbmnqykc.this.f11938lrnfpwlwnk : wkgbmnqykc.this.f11974zeieaojujs);
            }
            this.f11978iobyxmoadg = list;
        }

        @Override // androidx.media3.ui.wkgbmnqykc.draadjrbmk, androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(dxjokdxxww dxjokdxxwwVar, int i13) {
            super.onBindViewHolder(dxjokdxxwwVar, i13);
            if (i13 > 0) {
                dxjokdxxwwVar.f11981zoijcleaow.setVisibility(((gtknphoqwx) this.f11978iobyxmoadg.get(i13 + (-1))).iobyxmoadg() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.wkgbmnqykc.draadjrbmk
        public void lqeggnwhkg(dxjokdxxww dxjokdxxwwVar) {
            boolean z13;
            dxjokdxxwwVar.f11980iobyxmoadg.setText(d5.zynmafqrjb.exo_track_selection_none);
            int i13 = 0;
            while (true) {
                if (i13 >= this.f11978iobyxmoadg.size()) {
                    z13 = true;
                    break;
                } else {
                    if (((gtknphoqwx) this.f11978iobyxmoadg.get(i13)).iobyxmoadg()) {
                        z13 = false;
                        break;
                    }
                    i13++;
                }
            }
            dxjokdxxwwVar.f11981zoijcleaow.setVisibility(z13 ? 0 : 4);
            dxjokdxxwwVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.nufgyqmvbu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11895zdlpuopuiu.draadjrbmk(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class draadjrbmk extends RecyclerView.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected List f11978iobyxmoadg = new ArrayList();

        protected draadjrbmk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void eablkybsjg(v2.esjtqupxsv esjtqupxsvVar, v2.yadqdtsiqt yadqdtsiqtVar, gtknphoqwx gtknphoqwxVar, View view) {
            if (esjtqupxsvVar.kcexrzcfyt(29)) {
                esjtqupxsvVar.yadqdtsiqt(esjtqupxsvVar.cqumvgiudr().iobyxmoadg().jpowsppfya(new v2.iozdgvuglv(yadqdtsiqtVar, com.google.common.collect.zdlpuopuiu.istkbnxepw(Integer.valueOf(gtknphoqwxVar.f11988zoijcleaow)))).wypolnanlu(gtknphoqwxVar.f11986iobyxmoadg.ppxfxbqfkf(), false).iozdgvuglv());
                dxjokdxxww(gtknphoqwxVar.f11987ppxfxbqfkf);
                wkgbmnqykc.this.f11905cdpycssgdh.dismiss();
            }
        }

        protected abstract void dxjokdxxww(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        public int getItemCount() {
            if (this.f11978iobyxmoadg.isEmpty()) {
                return 0;
            }
            return this.f11978iobyxmoadg.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: gxszxtbevo */
        public void onBindViewHolder(dxjokdxxww dxjokdxxwwVar, int i13) {
            final v2.esjtqupxsv esjtqupxsvVar = wkgbmnqykc.this.f11903auzgnhcxok;
            if (esjtqupxsvVar == null) {
                return;
            }
            if (i13 == 0) {
                lqeggnwhkg(dxjokdxxwwVar);
                return;
            }
            final gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f11978iobyxmoadg.get(i13 - 1);
            final v2.yadqdtsiqt yadqdtsiqtVarIobyxmoadg = gtknphoqwxVar.f11986iobyxmoadg.iobyxmoadg();
            boolean z13 = esjtqupxsvVar.cqumvgiudr().f115573cdpycssgdh.get(yadqdtsiqtVarIobyxmoadg) != null && gtknphoqwxVar.iobyxmoadg();
            dxjokdxxwwVar.f11980iobyxmoadg.setText(gtknphoqwxVar.f11987ppxfxbqfkf);
            dxjokdxxwwVar.f11981zoijcleaow.setVisibility(z13 ? 0 : 4);
            dxjokdxxwwVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.dxjokdxxww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11793zdlpuopuiu.eablkybsjg(esjtqupxsvVar, yadqdtsiqtVarIobyxmoadg, gtknphoqwxVar, view);
                }
            });
        }

        protected abstract void lqeggnwhkg(dxjokdxxww dxjokdxxwwVar);

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww onCreateViewHolder(ViewGroup viewGroup, int i13) {
            return new dxjokdxxww(LayoutInflater.from(wkgbmnqykc.this.getContext()).inflate(d5.lereixgezr.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        protected void wkgbmnqykc() {
            this.f11978iobyxmoadg = Collections.emptyList();
        }
    }

    private static class dxjokdxxww extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final TextView f11980iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final View f11981zoijcleaow;

        public dxjokdxxww(View view) {
            super(view);
            if (stevsuqkhv.f123602iobyxmoadg < 26) {
                view.setFocusable(true);
            }
            this.f11980iobyxmoadg = (TextView) view.findViewById(d5.cqumvgiudr.exo_text);
            this.f11981zoijcleaow = view.findViewById(d5.cqumvgiudr.exo_check);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class eablkybsjg extends RecyclerView.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String[] f11982iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f11983ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float[] f11985zoijcleaow;

        public eablkybsjg(String[] strArr, float[] fArr) {
            this.f11982iobyxmoadg = strArr;
            this.f11985zoijcleaow = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void eablkybsjg(int i13, View view) {
            if (i13 != this.f11983ppxfxbqfkf) {
                wkgbmnqykc.this.setPlaybackSpeed(this.f11985zoijcleaow[i13]);
            }
            wkgbmnqykc.this.f11905cdpycssgdh.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        public int getItemCount() {
            return this.f11982iobyxmoadg.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(dxjokdxxww dxjokdxxwwVar, final int i13) {
            String[] strArr = this.f11982iobyxmoadg;
            if (i13 < strArr.length) {
                dxjokdxxwwVar.f11980iobyxmoadg.setText(strArr[i13]);
            }
            if (i13 == this.f11983ppxfxbqfkf) {
                dxjokdxxwwVar.itemView.setSelected(true);
                dxjokdxxwwVar.f11981zoijcleaow.setVisibility(0);
            } else {
                dxjokdxxwwVar.itemView.setSelected(false);
                dxjokdxxwwVar.f11981zoijcleaow.setVisibility(4);
            }
            dxjokdxxwwVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.gxszxtbevo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11797zdlpuopuiu.eablkybsjg(i13, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww onCreateViewHolder(ViewGroup viewGroup, int i13) {
            return new dxjokdxxww(LayoutInflater.from(wkgbmnqykc.this.getContext()).inflate(d5.lereixgezr.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public void nufgyqmvbu(float f13) {
            int i13 = 0;
            float f14 = Float.MAX_VALUE;
            int i14 = 0;
            while (true) {
                float[] fArr = this.f11985zoijcleaow;
                if (i13 >= fArr.length) {
                    this.f11983ppxfxbqfkf = i14;
                    return;
                }
                float fAbs = Math.abs(f13 - fArr[i13]);
                if (fAbs < f14) {
                    i14 = i13;
                    f14 = fAbs;
                }
                i13++;
            }
        }

        public String wkgbmnqykc() {
            return this.f11982iobyxmoadg[this.f11983ppxfxbqfkf];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final v2.wwaezpbzkn.iobyxmoadg f11986iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f11987ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11988zoijcleaow;

        public gtknphoqwx(v2.wwaezpbzkn wwaezpbzknVar, int i13, int i14, String str) {
            this.f11986iobyxmoadg = (v2.wwaezpbzkn.iobyxmoadg) wwaezpbzknVar.iobyxmoadg().get(i13);
            this.f11988zoijcleaow = i14;
            this.f11987ppxfxbqfkf = str;
        }

        public boolean iobyxmoadg() {
            return this.f11986iobyxmoadg.lqeggnwhkg(this.f11988zoijcleaow);
        }
    }

    public interface gxszxtbevo {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class lqeggnwhkg extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TextView f11989iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ImageView f11990ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TextView f11992zoijcleaow;

        public lqeggnwhkg(View view) {
            super(view);
            if (stevsuqkhv.f123602iobyxmoadg < 26) {
                view.setFocusable(true);
            }
            this.f11989iobyxmoadg = (TextView) view.findViewById(d5.cqumvgiudr.exo_main_text);
            this.f11992zoijcleaow = (TextView) view.findViewById(d5.cqumvgiudr.exo_sub_text);
            this.f11990ppxfxbqfkf = (ImageView) view.findViewById(d5.cqumvgiudr.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.lqeggnwhkg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11894zdlpuopuiu.gxszxtbevo(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo(View view) {
            wkgbmnqykc.this.czzsidtyhn(getBindingAdapterPosition());
        }
    }

    private class nufgyqmvbu extends RecyclerView.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String[] f11993iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Drawable[] f11994ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String[] f11996zoijcleaow;

        public nufgyqmvbu(String[] strArr, Drawable[] drawableArr) {
            this.f11993iobyxmoadg = strArr;
            this.f11996zoijcleaow = new String[strArr.length];
            this.f11994ppxfxbqfkf = drawableArr;
        }

        private boolean lqeggnwhkg(int i13) {
            if (wkgbmnqykc.this.f11903auzgnhcxok == null) {
                return false;
            }
            if (i13 == 0) {
                return wkgbmnqykc.this.f11903auzgnhcxok.kcexrzcfyt(13);
            }
            if (i13 != 1) {
                return true;
            }
            return wkgbmnqykc.this.f11903auzgnhcxok.kcexrzcfyt(30) && wkgbmnqykc.this.f11903auzgnhcxok.kcexrzcfyt(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg onCreateViewHolder(ViewGroup viewGroup, int i13) {
            return wkgbmnqykc.this.new lqeggnwhkg(LayoutInflater.from(wkgbmnqykc.this.getContext()).inflate(d5.lereixgezr.exo_styled_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        public int getItemCount() {
            return this.f11993iobyxmoadg.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        public long getItemId(int i13) {
            return i13;
        }

        public void gxszxtbevo(int i13, String str) {
            this.f11996zoijcleaow[i13] = str;
        }

        public boolean ppxfxbqfkf() {
            return lqeggnwhkg(1) || lqeggnwhkg(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(lqeggnwhkg lqeggnwhkgVar, int i13) {
            if (lqeggnwhkg(i13)) {
                lqeggnwhkgVar.itemView.setLayoutParams(new RecyclerView.vdvldrhtss(-1, -2));
            } else {
                lqeggnwhkgVar.itemView.setLayoutParams(new RecyclerView.vdvldrhtss(0, 0));
            }
            lqeggnwhkgVar.f11989iobyxmoadg.setText(this.f11993iobyxmoadg[i13]);
            if (this.f11996zoijcleaow[i13] == null) {
                lqeggnwhkgVar.f11992zoijcleaow.setVisibility(8);
            } else {
                lqeggnwhkgVar.f11992zoijcleaow.setText(this.f11996zoijcleaow[i13]);
            }
            if (this.f11994ppxfxbqfkf[i13] == null) {
                lqeggnwhkgVar.f11990ppxfxbqfkf.setVisibility(8);
            } else {
                lqeggnwhkgVar.f11990ppxfxbqfkf.setImageDrawable(this.f11994ppxfxbqfkf[i13]);
            }
        }
    }

    private final class ppxfxbqfkf implements v2.esjtqupxsv.wkgbmnqykc, lmojexxdyd.iobyxmoadg, View.OnClickListener, PopupWindow.OnDismissListener {
        private ppxfxbqfkf() {
        }

        @Override // androidx.media3.ui.lmojexxdyd.iobyxmoadg
        public void hkdspvbjdz(lmojexxdyd lmojexxdydVar, long j13, boolean z13) {
            wkgbmnqykc.this.f11919hszhottldk = false;
            if (!z13 && wkgbmnqykc.this.f11903auzgnhcxok != null) {
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                wkgbmnqykcVar.ydmasvzmpa(wkgbmnqykcVar.f11903auzgnhcxok, j13);
            }
            wkgbmnqykc.this.f11973zdlpuopuiu.sopmlzcsov();
        }

        @Override // androidx.media3.ui.lmojexxdyd.iobyxmoadg
        public void istkbnxepw(lmojexxdyd lmojexxdydVar, long j13) {
            wkgbmnqykc.this.f11919hszhottldk = true;
            if (wkgbmnqykc.this.f11955sopmlzcsov != null) {
                wkgbmnqykc.this.f11955sopmlzcsov.setText(stevsuqkhv.yfnezrywwk(wkgbmnqykc.this.f11930jlmebxxoox, wkgbmnqykc.this.f11950ribwqtqdhb, j13));
            }
            wkgbmnqykc.this.f11973zdlpuopuiu.ulzqkzuiru();
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void oipsdeybqn(v2.esjtqupxsv esjtqupxsvVar, v2.esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar.zoijcleaow(4, 5, 13)) {
                wkgbmnqykc.this.zeieaojujs();
            }
            if (ppxfxbqfkfVar.zoijcleaow(4, 5, 7, 13)) {
                wkgbmnqykc.this.tbqsvytpvh();
            }
            if (ppxfxbqfkfVar.zoijcleaow(8, 13)) {
                wkgbmnqykc.this.roivzttewh();
            }
            if (ppxfxbqfkfVar.zoijcleaow(9, 13)) {
                wkgbmnqykc.this.dvvnrvtcbc();
            }
            if (ppxfxbqfkfVar.zoijcleaow(8, 9, 11, 0, 16, 17, 13)) {
                wkgbmnqykc.this.lrnfpwlwnk();
            }
            if (ppxfxbqfkfVar.zoijcleaow(11, 0, 13)) {
                wkgbmnqykc.this.skhdrjzrfn();
            }
            if (ppxfxbqfkfVar.zoijcleaow(12, 13)) {
                wkgbmnqykc.this.nuxfzjnpeb();
            }
            if (ppxfxbqfkfVar.zoijcleaow(2, 13)) {
                wkgbmnqykc.this.igdgnonuha();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v2.esjtqupxsv esjtqupxsvVar = wkgbmnqykc.this.f11903auzgnhcxok;
            if (esjtqupxsvVar == null) {
                return;
            }
            wkgbmnqykc.this.f11973zdlpuopuiu.sopmlzcsov();
            if (wkgbmnqykc.this.f11937lmojexxdyd == view) {
                if (esjtqupxsvVar.kcexrzcfyt(9)) {
                    esjtqupxsvVar.esjtqupxsv();
                    return;
                }
                return;
            }
            if (wkgbmnqykc.this.f11922iozdgvuglv == view) {
                if (esjtqupxsvVar.kcexrzcfyt(7)) {
                    esjtqupxsvVar.gtknphoqwx();
                    return;
                }
                return;
            }
            if (wkgbmnqykc.this.f11972ylkuphrtab == view) {
                if (esjtqupxsvVar.tzroggbefp() == 4 || !esjtqupxsvVar.kcexrzcfyt(12)) {
                    return;
                }
                esjtqupxsvVar.ribwqtqdhb();
                return;
            }
            if (wkgbmnqykc.this.f11948pkzmftpjix == view) {
                if (esjtqupxsvVar.kcexrzcfyt(11)) {
                    esjtqupxsvVar.vipkmwdibw();
                    return;
                }
                return;
            }
            if (wkgbmnqykc.this.f11965wwaezpbzkn == view) {
                stevsuqkhv.lrnfpwlwnk(esjtqupxsvVar, wkgbmnqykc.this.f11939lxfrhoxuzk);
                return;
            }
            if (wkgbmnqykc.this.f11918hkdspvbjdz == view) {
                if (esjtqupxsvVar.kcexrzcfyt(15)) {
                    esjtqupxsvVar.ntlheqmsrt(y2.iozdgvuglv.iobyxmoadg(esjtqupxsvVar.sopmlzcsov(), wkgbmnqykc.this.f11915fyldjkxazc));
                    return;
                }
                return;
            }
            if (wkgbmnqykc.this.f11906cllcsxoeiz == view) {
                if (esjtqupxsvVar.kcexrzcfyt(14)) {
                    esjtqupxsvVar.lmojexxdyd(!esjtqupxsvVar.crxdokpmqz());
                    return;
                }
                return;
            }
            if (wkgbmnqykc.this.f11958tzroggbefp == view) {
                wkgbmnqykc.this.f11973zdlpuopuiu.ulzqkzuiru();
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                wkgbmnqykcVar.ulzqkzuiru(wkgbmnqykcVar.f11912esjtqupxsv, wkgbmnqykc.this.f11958tzroggbefp);
                return;
            }
            if (wkgbmnqykc.this.f11940mbcevpiqjq == view) {
                wkgbmnqykc.this.f11973zdlpuopuiu.ulzqkzuiru();
                wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
                wkgbmnqykcVar2.ulzqkzuiru(wkgbmnqykcVar2.f11936lereixgezr, wkgbmnqykc.this.f11940mbcevpiqjq);
            } else if (wkgbmnqykc.this.f11943ntlheqmsrt == view) {
                wkgbmnqykc.this.f11973zdlpuopuiu.ulzqkzuiru();
                wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykc.this;
                wkgbmnqykcVar3.ulzqkzuiru(wkgbmnqykcVar3.f11976zynmafqrjb, wkgbmnqykc.this.f11943ntlheqmsrt);
            } else if (wkgbmnqykc.this.f11966wypolnanlu == view) {
                wkgbmnqykc.this.f11973zdlpuopuiu.ulzqkzuiru();
                wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykc.this;
                wkgbmnqykcVar4.ulzqkzuiru(wkgbmnqykcVar4.f11949pmvmpeiblj, wkgbmnqykc.this.f11966wypolnanlu);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (wkgbmnqykc.this.f11914fmlbqenlif) {
                wkgbmnqykc.this.f11973zdlpuopuiu.sopmlzcsov();
            }
        }

        @Override // androidx.media3.ui.lmojexxdyd.iobyxmoadg
        public void pkzmftpjix(lmojexxdyd lmojexxdydVar, long j13) {
            if (wkgbmnqykc.this.f11955sopmlzcsov != null) {
                wkgbmnqykc.this.f11955sopmlzcsov.setText(stevsuqkhv.yfnezrywwk(wkgbmnqykc.this.f11930jlmebxxoox, wkgbmnqykc.this.f11950ribwqtqdhb, j13));
            }
        }
    }

    public interface wflxmlrfwp {
        void istkbnxepw(int i13);
    }

    /* JADX INFO: renamed from: androidx.media3.ui.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public interface InterfaceC0170wkgbmnqykc {
        void pkzmftpjix(boolean z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class zoijcleaow extends draadjrbmk {
        private zoijcleaow() {
            super();
        }

        private boolean gtknphoqwx(v2.lmojexxdyd lmojexxdydVar) {
            for (int i13 = 0; i13 < this.f11978iobyxmoadg.size(); i13++) {
                if (lmojexxdydVar.f115573cdpycssgdh.containsKey(((gtknphoqwx) this.f11978iobyxmoadg.get(i13)).f11986iobyxmoadg.iobyxmoadg())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wflxmlrfwp(View view) {
            if (wkgbmnqykc.this.f11903auzgnhcxok == null || !wkgbmnqykc.this.f11903auzgnhcxok.kcexrzcfyt(29)) {
                return;
            }
            ((v2.esjtqupxsv) stevsuqkhv.nufgyqmvbu(wkgbmnqykc.this.f11903auzgnhcxok)).yadqdtsiqt(wkgbmnqykc.this.f11903auzgnhcxok.cqumvgiudr().iobyxmoadg().lmojexxdyd(1).wypolnanlu(1, false).iozdgvuglv());
            wkgbmnqykc.this.f11912esjtqupxsv.gxszxtbevo(1, wkgbmnqykc.this.getResources().getString(d5.zynmafqrjb.exo_track_selection_auto));
            wkgbmnqykc.this.f11905cdpycssgdh.dismiss();
        }

        public void draadjrbmk(List list) {
            this.f11978iobyxmoadg = list;
            v2.lmojexxdyd lmojexxdydVarCqumvgiudr = ((v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(wkgbmnqykc.this.f11903auzgnhcxok)).cqumvgiudr();
            if (list.isEmpty()) {
                wkgbmnqykc.this.f11912esjtqupxsv.gxszxtbevo(1, wkgbmnqykc.this.getResources().getString(d5.zynmafqrjb.exo_track_selection_none));
                return;
            }
            if (!gtknphoqwx(lmojexxdydVarCqumvgiudr)) {
                wkgbmnqykc.this.f11912esjtqupxsv.gxszxtbevo(1, wkgbmnqykc.this.getResources().getString(d5.zynmafqrjb.exo_track_selection_auto));
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                gtknphoqwx gtknphoqwxVar = (gtknphoqwx) list.get(i13);
                if (gtknphoqwxVar.iobyxmoadg()) {
                    wkgbmnqykc.this.f11912esjtqupxsv.gxszxtbevo(1, gtknphoqwxVar.f11987ppxfxbqfkf);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.wkgbmnqykc.draadjrbmk
        public void dxjokdxxww(String str) {
            wkgbmnqykc.this.f11912esjtqupxsv.gxszxtbevo(1, str);
        }

        @Override // androidx.media3.ui.wkgbmnqykc.draadjrbmk
        public void lqeggnwhkg(dxjokdxxww dxjokdxxwwVar) {
            dxjokdxxwwVar.f11980iobyxmoadg.setText(d5.zynmafqrjb.exo_track_selection_auto);
            dxjokdxxwwVar.f11981zoijcleaow.setVisibility(gtknphoqwx(((v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(wkgbmnqykc.this.f11903auzgnhcxok)).cqumvgiudr()) ? 4 : 0);
            dxjokdxxwwVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.eablkybsjg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11794zdlpuopuiu.wflxmlrfwp(view);
                }
            });
        }
    }

    static {
        v2.zdlpuopuiu.iobyxmoadg("media3.ui");
        f11901ezmngbhpjk = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public wkgbmnqykc(Context context, AttributeSet attributeSet, int i13, AttributeSet attributeSet2) throws Throwable {
        int i14;
        int i15;
        final wkgbmnqykc wkgbmnqykcVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z23;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        final wkgbmnqykc wkgbmnqykcVar2;
        ImageView imageView;
        boolean z24;
        super(context, attributeSet, i13);
        int i36 = d5.lereixgezr.exo_player_control_view;
        int i37 = d5.jyumaefscl.exo_styled_controls_play;
        int i38 = d5.jyumaefscl.exo_styled_controls_pause;
        int i39 = d5.jyumaefscl.exo_styled_controls_next;
        int resourceId = d5.jyumaefscl.exo_styled_controls_simple_fastforward;
        int i43 = d5.jyumaefscl.exo_styled_controls_previous;
        int i44 = d5.jyumaefscl.exo_styled_controls_simple_rewind;
        int i45 = d5.jyumaefscl.exo_styled_controls_fullscreen_exit;
        int i46 = d5.jyumaefscl.exo_styled_controls_fullscreen_enter;
        int i47 = d5.jyumaefscl.exo_styled_controls_repeat_off;
        int i48 = d5.jyumaefscl.exo_styled_controls_repeat_one;
        int i49 = d5.jyumaefscl.exo_styled_controls_repeat_all;
        int i53 = d5.jyumaefscl.exo_styled_controls_shuffle_on;
        int i54 = d5.jyumaefscl.exo_styled_controls_shuffle_off;
        int i55 = d5.jyumaefscl.exo_styled_controls_subtitle_on;
        int i56 = d5.jyumaefscl.exo_styled_controls_subtitle_off;
        int i57 = d5.jyumaefscl.exo_styled_controls_vr;
        this.f11939lxfrhoxuzk = true;
        this.f11913fiwbwshyhd = 5000;
        this.f11915fyldjkxazc = 0;
        this.f11902ageimvtcrz = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, d5.cdpycssgdh.PlayerControlView, i13, 0);
            try {
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_controller_layout_id, i36);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_play_icon, i37);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_pause_icon, i38);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_next_icon, i39);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_fastforward_icon, resourceId);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_previous_icon, i43);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_rewind_icon, i44);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_fullscreen_exit_icon, i45);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_fullscreen_enter_icon, i46);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_repeat_off_icon, i47);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_repeat_one_icon, i48);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_repeat_all_icon, i49);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_shuffle_on_icon, i53);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_shuffle_off_icon, i54);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_subtitle_on_icon, i55);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_subtitle_off_icon, i56);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerControlView_vr_icon, i57);
                wkgbmnqykcVar = this;
                try {
                    wkgbmnqykcVar.f11913fiwbwshyhd = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerControlView_show_timeout, wkgbmnqykcVar.f11913fiwbwshyhd);
                    wkgbmnqykcVar.f11915fyldjkxazc = crxdokpmqz(typedArrayObtainStyledAttributes, wkgbmnqykcVar.f11915fyldjkxazc);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_rewind_button, true);
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_fastforward_button, true);
                    boolean z27 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_previous_button, true);
                    boolean z28 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_next_button, true);
                    boolean z29 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_shuffle_button, false);
                    boolean z33 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_subtitle_button, false);
                    boolean z34 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_show_vr_button, false);
                    wkgbmnqykcVar.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerControlView_time_bar_min_update_interval, wkgbmnqykcVar.f11902ageimvtcrz));
                    boolean z35 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i35 = resourceId14;
                    i34 = resourceId2;
                    z23 = z35;
                    i16 = resourceId7;
                    i17 = resourceId8;
                    i18 = resourceId9;
                    i19 = resourceId10;
                    i23 = resourceId11;
                    i24 = resourceId12;
                    i25 = resourceId13;
                    i26 = resourceId16;
                    i14 = resourceId17;
                    z13 = z25;
                    z14 = z26;
                    z15 = z27;
                    z16 = z28;
                    z17 = z29;
                    z18 = z33;
                    z19 = z34;
                    i27 = resourceId3;
                    i28 = resourceId4;
                    i29 = resourceId6;
                    i33 = resourceId15;
                    i15 = resourceId5;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            i14 = i57;
            i15 = i39;
            wkgbmnqykcVar = this;
            i16 = i44;
            i17 = i45;
            i18 = i46;
            i19 = i47;
            i23 = i48;
            i24 = i49;
            i25 = i53;
            i26 = i56;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = false;
            z18 = false;
            z19 = false;
            z23 = true;
            i27 = i37;
            i28 = i38;
            i29 = i43;
            i33 = i55;
            i34 = i36;
            i35 = i54;
        }
        LayoutInflater.from(context).inflate(i34, wkgbmnqykcVar);
        wkgbmnqykcVar.setDescendantFocusability(262144);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        wkgbmnqykcVar.f11933jyumaefscl = ppxfxbqfkfVar;
        wkgbmnqykcVar.f11925iwizpuwonk = new CopyOnWriteArrayList();
        wkgbmnqykcVar.f11962vipkmwdibw = new v2.cdpycssgdh.zoijcleaow();
        wkgbmnqykcVar.f11929jhduphickx = new v2.cdpycssgdh.ppxfxbqfkf();
        StringBuilder sb3 = new StringBuilder();
        wkgbmnqykcVar.f11930jlmebxxoox = sb3;
        int i58 = i29;
        wkgbmnqykcVar.f11950ribwqtqdhb = new Formatter(sb3, Locale.getDefault());
        wkgbmnqykcVar.f11923ipoelvxyzq = new long[0];
        wkgbmnqykcVar.f11916grlcpdaxtj = new boolean[0];
        wkgbmnqykcVar.f11942mhtqkkgtqm = new long[0];
        wkgbmnqykcVar.f11927ixidwrxhsl = new boolean[0];
        wkgbmnqykcVar.f11921ikoacuggdj = new Runnable() { // from class: d5.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f27054zdlpuopuiu.tbqsvytpvh();
            }
        };
        wkgbmnqykcVar.f11960ulzqkzuiru = (TextView) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_duration);
        wkgbmnqykcVar.f11955sopmlzcsov = (TextView) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_position);
        ImageView imageView2 = (ImageView) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_subtitle);
        wkgbmnqykcVar.f11966wypolnanlu = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView3 = (ImageView) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_fullscreen);
        wkgbmnqykcVar.f11956stevsuqkhv = imageView3;
        jhduphickx(imageView3, new View.OnClickListener() { // from class: d5.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27062zdlpuopuiu.metgxyhuhe(view);
            }
        });
        ImageView imageView4 = (ImageView) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_minimal_fullscreen);
        wkgbmnqykcVar.f11935kegysxyocb = imageView4;
        jhduphickx(imageView4, new View.OnClickListener() { // from class: d5.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27062zdlpuopuiu.metgxyhuhe(view);
            }
        });
        View viewFindViewById = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_settings);
        wkgbmnqykcVar.f11958tzroggbefp = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(ppxfxbqfkfVar);
        }
        View viewFindViewById2 = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_playback_speed);
        wkgbmnqykcVar.f11940mbcevpiqjq = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(ppxfxbqfkfVar);
        }
        View viewFindViewById3 = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_audio_track);
        wkgbmnqykcVar.f11943ntlheqmsrt = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(ppxfxbqfkfVar);
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_progress);
        View viewFindViewById4 = wkgbmnqykcVar.findViewById(d5.cqumvgiudr.exo_progress_placeholder);
        if (lmojexxdydVar != null) {
            wkgbmnqykcVar.f11908crxdokpmqz = lmojexxdydVar;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if (viewFindViewById4 != null) {
            androidx.media3.ui.zoijcleaow zoijcleaowVar = new androidx.media3.ui.zoijcleaow(context, null, 0, attributeSet2, d5.istkbnxepw.ExoStyledControls_TimeBar);
            zoijcleaowVar.setId(d5.cqumvgiudr.exo_progress);
            zoijcleaowVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(zoijcleaowVar, iIndexOfChild);
            wkgbmnqykcVar2 = this;
            wkgbmnqykcVar2.f11908crxdokpmqz = zoijcleaowVar;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            wkgbmnqykcVar2.f11908crxdokpmqz = null;
        }
        lmojexxdyd lmojexxdydVar2 = wkgbmnqykcVar2.f11908crxdokpmqz;
        if (lmojexxdydVar2 != null) {
            lmojexxdydVar2.iobyxmoadg(ppxfxbqfkfVar);
        }
        Resources resources = context.getResources();
        wkgbmnqykcVar2.f11971yggfygwlhe = resources;
        ImageView imageView5 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_play_pause);
        wkgbmnqykcVar2.f11965wwaezpbzkn = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView6 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_prev);
        wkgbmnqykcVar2.f11922iozdgvuglv = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, i58));
            imageView6.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView7 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_next);
        wkgbmnqykcVar2.f11937lmojexxdyd = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, i15));
            imageView7.setOnClickListener(ppxfxbqfkfVar);
        }
        Typeface typefaceDxjokdxxww = i1.nufgyqmvbu.dxjokdxxww(context, d5.iwizpuwonk.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_rew);
        TextView textView = (TextView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView = imageView6;
            imageView8.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, i16));
            wkgbmnqykcVar2.f11948pkzmftpjix = imageView8;
            wkgbmnqykcVar2.f11931jpowsppfya = null;
        } else {
            imageView = imageView6;
            if (textView != null) {
                textView.setTypeface(typefaceDxjokdxxww);
                wkgbmnqykcVar2.f11931jpowsppfya = textView;
                wkgbmnqykcVar2.f11948pkzmftpjix = textView;
            } else {
                wkgbmnqykcVar2.f11931jpowsppfya = null;
                wkgbmnqykcVar2.f11948pkzmftpjix = null;
            }
        }
        View view = wkgbmnqykcVar2.f11948pkzmftpjix;
        if (view != null) {
            view.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView9 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_ffwd);
        TextView textView2 = (TextView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, resourceId));
            wkgbmnqykcVar2.f11972ylkuphrtab = imageView9;
            wkgbmnqykcVar2.f11917hcddaimhww = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceDxjokdxxww);
            wkgbmnqykcVar2.f11917hcddaimhww = textView2;
            wkgbmnqykcVar2.f11972ylkuphrtab = textView2;
        } else {
            wkgbmnqykcVar2.f11917hcddaimhww = null;
            wkgbmnqykcVar2.f11972ylkuphrtab = null;
        }
        View view2 = wkgbmnqykcVar2.f11972ylkuphrtab;
        if (view2 != null) {
            view2.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView10 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_repeat_toggle);
        wkgbmnqykcVar2.f11918hkdspvbjdz = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(ppxfxbqfkfVar);
        }
        ImageView imageView11 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_shuffle);
        wkgbmnqykcVar2.f11906cllcsxoeiz = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(ppxfxbqfkfVar);
        }
        wkgbmnqykcVar2.f11975zfvoamnweg = resources.getInteger(d5.esjtqupxsv.exo_media_button_opacity_percentage_enabled) / 100.0f;
        wkgbmnqykcVar2.f11945oipsdeybqn = resources.getInteger(d5.esjtqupxsv.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_vr);
        wkgbmnqykcVar2.f11910dsvhmnatus = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, i14));
            wkgbmnqykcVar2.oipsdeybqn(false, imageView12);
        }
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk(wkgbmnqykcVar2);
        wkgbmnqykcVar2.f11973zdlpuopuiu = iwizpuwonkVar;
        iwizpuwonkVar.crxdokpmqz(z23);
        nufgyqmvbu nufgyqmvbuVar = wkgbmnqykcVar2.new nufgyqmvbu(new String[]{resources.getString(d5.zynmafqrjb.exo_controls_playback_speed), resources.getString(d5.zynmafqrjb.exo_track_selection_title_audio)}, new Drawable[]{stevsuqkhv.sopmlzcsov(context, resources, d5.jyumaefscl.exo_styled_controls_speed), stevsuqkhv.sopmlzcsov(context, resources, d5.jyumaefscl.exo_styled_controls_audiotrack)});
        wkgbmnqykcVar2.f11912esjtqupxsv = nufgyqmvbuVar;
        wkgbmnqykcVar2.f11968yadqdtsiqt = resources.getDimensionPixelSize(d5.yggfygwlhe.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(d5.lereixgezr.exo_styled_settings_list, (ViewGroup) null);
        wkgbmnqykcVar2.f11907cqumvgiudr = recyclerView;
        recyclerView.setAdapter(nufgyqmvbuVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        wkgbmnqykcVar2.f11905cdpycssgdh = popupWindow;
        if (stevsuqkhv.f123602iobyxmoadg < 23) {
            z24 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z24 = false;
        }
        popupWindow.setOnDismissListener(ppxfxbqfkfVar);
        wkgbmnqykcVar2.f11914fmlbqenlif = true;
        wkgbmnqykcVar2.f11924istkbnxepw = new d5.eablkybsjg(getResources());
        wkgbmnqykcVar2.f11928iyctptxqzt = stevsuqkhv.sopmlzcsov(context, resources, i33);
        wkgbmnqykcVar2.f11963weqkydbzbr = stevsuqkhv.sopmlzcsov(context, resources, i26);
        wkgbmnqykcVar2.f11938lrnfpwlwnk = resources.getString(d5.zynmafqrjb.exo_controls_cc_enabled_description);
        wkgbmnqykcVar2.f11974zeieaojujs = resources.getString(d5.zynmafqrjb.exo_controls_cc_disabled_description);
        wkgbmnqykcVar2.f11949pmvmpeiblj = new btonecajqb();
        wkgbmnqykcVar2.f11976zynmafqrjb = new zoijcleaow();
        wkgbmnqykcVar2.f11936lereixgezr = wkgbmnqykcVar2.new eablkybsjg(resources.getStringArray(d5.kcexrzcfyt.exo_controls_playback_speeds), f11901ezmngbhpjk);
        wkgbmnqykcVar2.f11946okpsazkaxt = stevsuqkhv.sopmlzcsov(context, resources, i27);
        wkgbmnqykcVar2.f11934jztzpxfvev = stevsuqkhv.sopmlzcsov(context, resources, i28);
        wkgbmnqykcVar2.f11944nuxfzjnpeb = stevsuqkhv.sopmlzcsov(context, resources, i17);
        wkgbmnqykcVar2.f11957tbqsvytpvh = stevsuqkhv.sopmlzcsov(context, resources, i18);
        wkgbmnqykcVar2.f11967xrmfcynszj = stevsuqkhv.sopmlzcsov(context, resources, i19);
        wkgbmnqykcVar2.f11941metgxyhuhe = stevsuqkhv.sopmlzcsov(context, resources, i23);
        wkgbmnqykcVar2.f11951rlfsiqarku = stevsuqkhv.sopmlzcsov(context, resources, i24);
        wkgbmnqykcVar2.f11969ydmasvzmpa = stevsuqkhv.sopmlzcsov(context, resources, i25);
        wkgbmnqykcVar2.f11953sflfametgt = stevsuqkhv.sopmlzcsov(context, resources, i35);
        wkgbmnqykcVar2.f11952roivzttewh = resources.getString(d5.zynmafqrjb.exo_controls_fullscreen_exit_description);
        wkgbmnqykcVar2.f11959uawqvzlxes = resources.getString(d5.zynmafqrjb.exo_controls_fullscreen_enter_description);
        wkgbmnqykcVar2.f11909czzsidtyhn = resources.getString(d5.zynmafqrjb.exo_controls_repeat_off_description);
        wkgbmnqykcVar2.f11961uwvvkdfqfp = resources.getString(d5.zynmafqrjb.exo_controls_repeat_one_description);
        wkgbmnqykcVar2.f11970yfnezrywwk = resources.getString(d5.zynmafqrjb.exo_controls_repeat_all_description);
        wkgbmnqykcVar2.f11904bfopjjpdmp = resources.getString(d5.zynmafqrjb.exo_controls_shuffle_on_description);
        wkgbmnqykcVar2.f11947opjhrmiecq = resources.getString(d5.zynmafqrjb.exo_controls_shuffle_off_description);
        iwizpuwonkVar.jlmebxxoox((ViewGroup) wkgbmnqykcVar2.findViewById(d5.cqumvgiudr.exo_bottom_bar), true);
        iwizpuwonkVar.jlmebxxoox(wkgbmnqykcVar2.f11972ylkuphrtab, z14);
        iwizpuwonkVar.jlmebxxoox(wkgbmnqykcVar2.f11948pkzmftpjix, z13);
        iwizpuwonkVar.jlmebxxoox(imageView, z15);
        iwizpuwonkVar.jlmebxxoox(imageView7, z16);
        iwizpuwonkVar.jlmebxxoox(imageView11, z17);
        iwizpuwonkVar.jlmebxxoox(imageView2, z18);
        iwizpuwonkVar.jlmebxxoox(imageView12, z19);
        iwizpuwonkVar.jlmebxxoox(imageView10, wkgbmnqykcVar2.f11915fyldjkxazc != 0 ? true : z24);
        wkgbmnqykcVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: d5.nufgyqmvbu
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i59, int i63, int i64, int i65, int i66, int i67, int i68, int i69) {
                this.f27063iobyxmoadg.rlfsiqarku(view3, i59, i63, i64, i65, i66, i67, i68, i69);
            }
        });
    }

    private void auzgnhcxok() {
        oipsdeybqn(this.f11912esjtqupxsv.ppxfxbqfkf(), this.f11958tzroggbefp);
    }

    private void bfopjjpdmp() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        int iWypolnanlu = (int) ((esjtqupxsvVar != null ? esjtqupxsvVar.wypolnanlu() : 15000L) / 1000);
        TextView textView = this.f11917hcddaimhww;
        if (textView != null) {
            textView.setText(String.valueOf(iWypolnanlu));
        }
        View view = this.f11972ylkuphrtab;
        if (view != null) {
            view.setContentDescription(this.f11971yggfygwlhe.getQuantityString(d5.pmvmpeiblj.exo_controls_fastforward_by_amount_description, iWypolnanlu, Integer.valueOf(iWypolnanlu)));
        }
    }

    private static int crxdokpmqz(TypedArray typedArray, int i13) {
        return typedArray.getInt(d5.cdpycssgdh.PlayerControlView_repeat_toggle_modes, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void czzsidtyhn(int i13) {
        if (i13 == 0) {
            ulzqkzuiru(this.f11936lereixgezr, (View) y2.iobyxmoadg.eablkybsjg(this.f11958tzroggbefp));
        } else if (i13 == 1) {
            ulzqkzuiru(this.f11976zynmafqrjb, (View) y2.iobyxmoadg.eablkybsjg(this.f11958tzroggbefp));
        } else {
            this.f11905cdpycssgdh.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dvvnrvtcbc() {
        ImageView imageView;
        if (jztzpxfvev() && this.f11954skhdrjzrfn && (imageView = this.f11906cllcsxoeiz) != null) {
            v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
            if (!this.f11973zdlpuopuiu.pmvmpeiblj(imageView)) {
                oipsdeybqn(false, this.f11906cllcsxoeiz);
                return;
            }
            if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(14)) {
                oipsdeybqn(false, this.f11906cllcsxoeiz);
                this.f11906cllcsxoeiz.setImageDrawable(this.f11953sflfametgt);
                this.f11906cllcsxoeiz.setContentDescription(this.f11947opjhrmiecq);
            } else {
                oipsdeybqn(true, this.f11906cllcsxoeiz);
                this.f11906cllcsxoeiz.setImageDrawable(esjtqupxsvVar.crxdokpmqz() ? this.f11969ydmasvzmpa : this.f11953sflfametgt);
                this.f11906cllcsxoeiz.setContentDescription(esjtqupxsvVar.crxdokpmqz() ? this.f11904bfopjjpdmp : this.f11947opjhrmiecq);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void igdgnonuha() {
        vipkmwdibw();
        oipsdeybqn(this.f11949pmvmpeiblj.getItemCount() > 0, this.f11966wypolnanlu);
        auzgnhcxok();
    }

    private void iwxlajgraz() {
        this.f11907cqumvgiudr.measure(0, 0);
        this.f11905cdpycssgdh.setWidth(Math.min(this.f11907cqumvgiudr.getMeasuredWidth(), getWidth() - (this.f11968yadqdtsiqt * 2)));
        this.f11905cdpycssgdh.setHeight(Math.min(getHeight() - (this.f11968yadqdtsiqt * 2), this.f11907cqumvgiudr.getMeasuredHeight()));
    }

    private static void iyctptxqzt(View view, boolean z13) {
        if (view == null) {
            return;
        }
        if (z13) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static void jhduphickx(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lrnfpwlwnk() {
        boolean zKcexrzcfyt;
        boolean zKcexrzcfyt2;
        boolean zKcexrzcfyt3;
        boolean zKcexrzcfyt4;
        boolean zKcexrzcfyt5;
        if (jztzpxfvev() && this.f11954skhdrjzrfn) {
            v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
            if (esjtqupxsvVar != null) {
                zKcexrzcfyt = (this.f11920igdgnonuha && mbcevpiqjq(esjtqupxsvVar, this.f11929jhduphickx)) ? esjtqupxsvVar.kcexrzcfyt(10) : esjtqupxsvVar.kcexrzcfyt(5);
                zKcexrzcfyt3 = esjtqupxsvVar.kcexrzcfyt(7);
                zKcexrzcfyt4 = esjtqupxsvVar.kcexrzcfyt(11);
                zKcexrzcfyt5 = esjtqupxsvVar.kcexrzcfyt(12);
                zKcexrzcfyt2 = esjtqupxsvVar.kcexrzcfyt(9);
            } else {
                zKcexrzcfyt = false;
                zKcexrzcfyt2 = false;
                zKcexrzcfyt3 = false;
                zKcexrzcfyt4 = false;
                zKcexrzcfyt5 = false;
            }
            if (zKcexrzcfyt4) {
                uawqvzlxes();
            }
            if (zKcexrzcfyt5) {
                bfopjjpdmp();
            }
            oipsdeybqn(zKcexrzcfyt3, this.f11922iozdgvuglv);
            oipsdeybqn(zKcexrzcfyt4, this.f11948pkzmftpjix);
            oipsdeybqn(zKcexrzcfyt5, this.f11972ylkuphrtab);
            oipsdeybqn(zKcexrzcfyt2, this.f11937lmojexxdyd);
            lmojexxdyd lmojexxdydVar = this.f11908crxdokpmqz;
            if (lmojexxdydVar != null) {
                lmojexxdydVar.setEnabled(zKcexrzcfyt);
            }
        }
    }

    private static boolean mbcevpiqjq(v2.esjtqupxsv esjtqupxsvVar, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar) {
        v2.cdpycssgdh cdpycssgdhVarJyumaefscl;
        int iRgvfuqvkyq;
        if (!esjtqupxsvVar.kcexrzcfyt(17) || (iRgvfuqvkyq = (cdpycssgdhVarJyumaefscl = esjtqupxsvVar.jyumaefscl()).rgvfuqvkyq()) <= 1 || iRgvfuqvkyq > 100) {
            return false;
        }
        for (int i13 = 0; i13 < iRgvfuqvkyq; i13++) {
            if (cdpycssgdhVarJyumaefscl.agtfadlqog(i13, ppxfxbqfkfVar).f115292wflxmlrfwp == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void metgxyhuhe(View view) {
        weqkydbzbr(!this.f11911dvvnrvtcbc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nuxfzjnpeb() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar == null) {
            return;
        }
        this.f11936lereixgezr.nufgyqmvbu(esjtqupxsvVar.lqeggnwhkg().f115310iobyxmoadg);
        this.f11912esjtqupxsv.gxszxtbevo(0, this.f11936lereixgezr.wkgbmnqykc());
        auzgnhcxok();
    }

    private void oipsdeybqn(boolean z13, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z13);
        view.setAlpha(z13 ? this.f11975zfvoamnweg : this.f11945oipsdeybqn);
    }

    private static boolean okpsazkaxt(int i13) {
        return i13 == 90 || i13 == 89 || i13 == 85 || i13 == 79 || i13 == 126 || i13 == 127 || i13 == 87 || i13 == 88;
    }

    private void opjhrmiecq(ImageView imageView, boolean z13) {
        if (imageView == null) {
            return;
        }
        if (z13) {
            imageView.setImageDrawable(this.f11944nuxfzjnpeb);
            imageView.setContentDescription(this.f11952roivzttewh);
        } else {
            imageView.setImageDrawable(this.f11957tbqsvytpvh);
            imageView.setContentDescription(this.f11959uawqvzlxes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rlfsiqarku(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int i24 = i16 - i14;
        int i25 = i23 - i18;
        if (!(i15 - i13 == i19 - i17 && i24 == i25) && this.f11905cdpycssgdh.isShowing()) {
            iwxlajgraz();
            this.f11905cdpycssgdh.update(view, (getWidth() - this.f11905cdpycssgdh.getWidth()) - this.f11968yadqdtsiqt, (-this.f11905cdpycssgdh.getHeight()) - this.f11968yadqdtsiqt, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void roivzttewh() {
        ImageView imageView;
        if (jztzpxfvev() && this.f11954skhdrjzrfn && (imageView = this.f11918hkdspvbjdz) != null) {
            if (this.f11915fyldjkxazc == 0) {
                oipsdeybqn(false, imageView);
                return;
            }
            v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
            if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(15)) {
                oipsdeybqn(false, this.f11918hkdspvbjdz);
                this.f11918hkdspvbjdz.setImageDrawable(this.f11967xrmfcynszj);
                this.f11918hkdspvbjdz.setContentDescription(this.f11909czzsidtyhn);
                return;
            }
            oipsdeybqn(true, this.f11918hkdspvbjdz);
            int iSopmlzcsov = esjtqupxsvVar.sopmlzcsov();
            if (iSopmlzcsov == 0) {
                this.f11918hkdspvbjdz.setImageDrawable(this.f11967xrmfcynszj);
                this.f11918hkdspvbjdz.setContentDescription(this.f11909czzsidtyhn);
            } else if (iSopmlzcsov == 1) {
                this.f11918hkdspvbjdz.setImageDrawable(this.f11941metgxyhuhe);
                this.f11918hkdspvbjdz.setContentDescription(this.f11961uwvvkdfqfp);
            } else {
                if (iSopmlzcsov != 2) {
                    return;
                }
                this.f11918hkdspvbjdz.setImageDrawable(this.f11951rlfsiqarku);
                this.f11918hkdspvbjdz.setContentDescription(this.f11970yfnezrywwk);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f13) {
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(13)) {
            return;
        }
        v2.esjtqupxsv esjtqupxsvVar2 = this.f11903auzgnhcxok;
        esjtqupxsvVar2.eablkybsjg(esjtqupxsvVar2.lqeggnwhkg().zoijcleaow(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd A[SYNTHETIC] */
    public void skhdrjzrfn() {
        long jIxidwrxhsl;
        int i13;
        v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar;
        long jAgtfadlqog;
        long[] jArr;
        int length;
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar == null) {
            return;
        }
        boolean z13 = true;
        this.f11964wizcaqwiak = this.f11920igdgnonuha && mbcevpiqjq(esjtqupxsvVar, this.f11929jhduphickx);
        this.f11932jrbgnlbqoe = 0L;
        v2.cdpycssgdh cdpycssgdhVarJyumaefscl = esjtqupxsvVar.kcexrzcfyt(17) ? esjtqupxsvVar.jyumaefscl() : v2.cdpycssgdh.f115259iobyxmoadg;
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            if (esjtqupxsvVar.kcexrzcfyt(16)) {
                long jYlkuphrtab = esjtqupxsvVar.ylkuphrtab();
                if (jYlkuphrtab != -9223372036854775807L) {
                    jIxidwrxhsl = stevsuqkhv.ixidwrxhsl(jYlkuphrtab);
                } else {
                    jIxidwrxhsl = 0;
                }
            } else {
                jIxidwrxhsl = 0;
            }
            i13 = 0;
        } else {
            int iMbcevpiqjq = esjtqupxsvVar.mbcevpiqjq();
            boolean z14 = this.f11964wizcaqwiak;
            int i14 = z14 ? 0 : iMbcevpiqjq;
            int iRgvfuqvkyq = z14 ? cdpycssgdhVarJyumaefscl.rgvfuqvkyq() - 1 : iMbcevpiqjq;
            long j13 = 0;
            i13 = 0;
            while (i14 <= iRgvfuqvkyq) {
                if (i14 == iMbcevpiqjq) {
                    this.f11932jrbgnlbqoe = stevsuqkhv.t(j13);
                }
                cdpycssgdhVarJyumaefscl.agtfadlqog(i14, this.f11929jhduphickx);
                v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar2 = this.f11929jhduphickx;
                if (ppxfxbqfkfVar2.f115292wflxmlrfwp == -9223372036854775807L) {
                    y2.iobyxmoadg.lqeggnwhkg(this.f11964wizcaqwiak ^ z13);
                    break;
                }
                int i15 = ppxfxbqfkfVar2.f115279agtfadlqog;
                while (true) {
                    ppxfxbqfkfVar = this.f11929jhduphickx;
                    if (i15 <= ppxfxbqfkfVar.f115289ojitshcjhn) {
                        cdpycssgdhVarJyumaefscl.gxszxtbevo(i15, this.f11962vipkmwdibw);
                        int iPpxfxbqfkf = this.f11962vipkmwdibw.ppxfxbqfkf();
                        for (int iOjitshcjhn = this.f11962vipkmwdibw.ojitshcjhn(); iOjitshcjhn < iPpxfxbqfkf; iOjitshcjhn++) {
                            long jGxszxtbevo = this.f11962vipkmwdibw.gxszxtbevo(iOjitshcjhn);
                            if (jGxszxtbevo == Long.MIN_VALUE) {
                                long j14 = this.f11962vipkmwdibw.f115305wkgbmnqykc;
                                if (j14 != -9223372036854775807L) {
                                    jGxszxtbevo = j14;
                                    jAgtfadlqog = jGxszxtbevo + this.f11962vipkmwdibw.agtfadlqog();
                                    if (jAgtfadlqog >= 0) {
                                        jArr = this.f11923ipoelvxyzq;
                                        if (i13 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.f11923ipoelvxyzq = Arrays.copyOf(jArr, length);
                                            this.f11916grlcpdaxtj = Arrays.copyOf(this.f11916grlcpdaxtj, length);
                                        }
                                        this.f11923ipoelvxyzq[i13] = stevsuqkhv.t(j13 + jAgtfadlqog);
                                        this.f11916grlcpdaxtj[i13] = this.f11962vipkmwdibw.rgvfuqvkyq(iOjitshcjhn);
                                        i13++;
                                    }
                                }
                            } else {
                                jAgtfadlqog = jGxszxtbevo + this.f11962vipkmwdibw.agtfadlqog();
                                if (jAgtfadlqog >= 0) {
                                    jArr = this.f11923ipoelvxyzq;
                                    if (i13 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f11923ipoelvxyzq = Arrays.copyOf(jArr, length);
                                        this.f11916grlcpdaxtj = Arrays.copyOf(this.f11916grlcpdaxtj, length);
                                    }
                                    this.f11923ipoelvxyzq[i13] = stevsuqkhv.t(j13 + jAgtfadlqog);
                                    this.f11916grlcpdaxtj[i13] = this.f11962vipkmwdibw.rgvfuqvkyq(iOjitshcjhn);
                                    i13++;
                                }
                            }
                        }
                        i15++;
                    }
                }
                j13 += ppxfxbqfkfVar.f115292wflxmlrfwp;
                i14++;
                z13 = true;
            }
            jIxidwrxhsl = j13;
        }
        long jT = stevsuqkhv.t(jIxidwrxhsl);
        TextView textView = this.f11960ulzqkzuiru;
        if (textView != null) {
            textView.setText(stevsuqkhv.yfnezrywwk(this.f11930jlmebxxoox, this.f11950ribwqtqdhb, jT));
        }
        lmojexxdyd lmojexxdydVar = this.f11908crxdokpmqz;
        if (lmojexxdydVar != null) {
            lmojexxdydVar.setDuration(jT);
            int length2 = this.f11942mhtqkkgtqm.length;
            int i16 = i13 + length2;
            long[] jArr2 = this.f11923ipoelvxyzq;
            if (i16 > jArr2.length) {
                this.f11923ipoelvxyzq = Arrays.copyOf(jArr2, i16);
                this.f11916grlcpdaxtj = Arrays.copyOf(this.f11916grlcpdaxtj, i16);
            }
            System.arraycopy(this.f11942mhtqkkgtqm, 0, this.f11923ipoelvxyzq, i13, length2);
            System.arraycopy(this.f11927ixidwrxhsl, 0, this.f11916grlcpdaxtj, i13, length2);
            this.f11908crxdokpmqz.zoijcleaow(this.f11923ipoelvxyzq, this.f11916grlcpdaxtj, i16);
        }
        tbqsvytpvh();
    }

    private com.google.common.collect.zdlpuopuiu sopmlzcsov(v2.wwaezpbzkn wwaezpbzknVar, int i13) {
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVar = new com.google.common.collect.zdlpuopuiu.iobyxmoadg();
        com.google.common.collect.zdlpuopuiu zdlpuopuiuVarIobyxmoadg = wwaezpbzknVar.iobyxmoadg();
        for (int i14 = 0; i14 < zdlpuopuiuVarIobyxmoadg.size(); i14++) {
            v2.wwaezpbzkn.iobyxmoadg iobyxmoadgVar2 = (v2.wwaezpbzkn.iobyxmoadg) zdlpuopuiuVarIobyxmoadg.get(i14);
            if (iobyxmoadgVar2.ppxfxbqfkf() == i13) {
                for (int i15 = 0; i15 < iobyxmoadgVar2.f115698iobyxmoadg; i15++) {
                    if (iobyxmoadgVar2.nufgyqmvbu(i15)) {
                        androidx.media3.common.iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadgVar2.zoijcleaow(i15);
                        if ((iobyxmoadgVarZoijcleaow.f9752eablkybsjg & 2) == 0) {
                            iobyxmoadgVar.iobyxmoadg(new gtknphoqwx(wwaezpbzknVar, i14, i15, this.f11924istkbnxepw.iobyxmoadg(iobyxmoadgVarZoijcleaow)));
                        }
                    }
                }
            }
        }
        return iobyxmoadgVar.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tbqsvytpvh() {
        long jStevsuqkhv;
        long jJlmebxxoox;
        if (jztzpxfvev() && this.f11954skhdrjzrfn) {
            v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
            if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(16)) {
                jStevsuqkhv = 0;
                jJlmebxxoox = 0;
            } else {
                jStevsuqkhv = this.f11932jrbgnlbqoe + esjtqupxsvVar.stevsuqkhv();
                jJlmebxxoox = this.f11932jrbgnlbqoe + esjtqupxsvVar.jlmebxxoox();
            }
            TextView textView = this.f11955sopmlzcsov;
            if (textView != null && !this.f11919hszhottldk) {
                textView.setText(stevsuqkhv.yfnezrywwk(this.f11930jlmebxxoox, this.f11950ribwqtqdhb, jStevsuqkhv));
            }
            lmojexxdyd lmojexxdydVar = this.f11908crxdokpmqz;
            if (lmojexxdydVar != null) {
                lmojexxdydVar.setPosition(jStevsuqkhv);
                this.f11908crxdokpmqz.setBufferedPosition(jJlmebxxoox);
            }
            removeCallbacks(this.f11921ikoacuggdj);
            int iTzroggbefp = esjtqupxsvVar == null ? 1 : esjtqupxsvVar.tzroggbefp();
            if (esjtqupxsvVar == null || !esjtqupxsvVar.nufgyqmvbu()) {
                if (iTzroggbefp == 4 || iTzroggbefp == 1) {
                    return;
                }
                postDelayed(this.f11921ikoacuggdj, 1000L);
                return;
            }
            lmojexxdyd lmojexxdydVar2 = this.f11908crxdokpmqz;
            long jMin = Math.min(lmojexxdydVar2 != null ? lmojexxdydVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jStevsuqkhv % 1000));
            float f13 = esjtqupxsvVar.lqeggnwhkg().f115310iobyxmoadg;
            postDelayed(this.f11921ikoacuggdj, stevsuqkhv.rgvfuqvkyq(f13 > 0.0f ? (long) (jMin / f13) : 1000L, this.f11902ageimvtcrz, 1000L));
        }
    }

    private void uawqvzlxes() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        int iOkpsazkaxt = (int) ((esjtqupxsvVar != null ? esjtqupxsvVar.okpsazkaxt() : DeviceOrientationRequest.OUTPUT_PERIOD_FAST) / 1000);
        TextView textView = this.f11931jpowsppfya;
        if (textView != null) {
            textView.setText(String.valueOf(iOkpsazkaxt));
        }
        View view = this.f11948pkzmftpjix;
        if (view != null) {
            view.setContentDescription(this.f11971yggfygwlhe.getQuantityString(d5.pmvmpeiblj.exo_controls_rewind_by_amount_description, iOkpsazkaxt, Integer.valueOf(iOkpsazkaxt)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ulzqkzuiru(RecyclerView.nufgyqmvbu nufgyqmvbuVar, View view) {
        this.f11907cqumvgiudr.setAdapter(nufgyqmvbuVar);
        iwxlajgraz();
        this.f11914fmlbqenlif = false;
        this.f11905cdpycssgdh.dismiss();
        this.f11914fmlbqenlif = true;
        this.f11905cdpycssgdh.showAsDropDown(view, (getWidth() - this.f11905cdpycssgdh.getWidth()) - this.f11968yadqdtsiqt, (-this.f11905cdpycssgdh.getHeight()) - this.f11968yadqdtsiqt);
    }

    private void vipkmwdibw() {
        this.f11949pmvmpeiblj.wkgbmnqykc();
        this.f11976zynmafqrjb.wkgbmnqykc();
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar != null && esjtqupxsvVar.kcexrzcfyt(30) && this.f11903auzgnhcxok.kcexrzcfyt(29)) {
            v2.wwaezpbzkn wwaezpbzknVarOjitshcjhn = this.f11903auzgnhcxok.ojitshcjhn();
            this.f11976zynmafqrjb.draadjrbmk(sopmlzcsov(wwaezpbzknVarOjitshcjhn, 1));
            if (this.f11973zdlpuopuiu.pmvmpeiblj(this.f11966wypolnanlu)) {
                this.f11949pmvmpeiblj.gtknphoqwx(sopmlzcsov(wwaezpbzknVarOjitshcjhn, 3));
            } else {
                this.f11949pmvmpeiblj.gtknphoqwx(com.google.common.collect.zdlpuopuiu.zynmafqrjb());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ydmasvzmpa(v2.esjtqupxsv esjtqupxsvVar, long j13) {
        if (this.f11964wizcaqwiak) {
            if (esjtqupxsvVar.kcexrzcfyt(17) && esjtqupxsvVar.kcexrzcfyt(10)) {
                v2.cdpycssgdh cdpycssgdhVarJyumaefscl = esjtqupxsvVar.jyumaefscl();
                int iRgvfuqvkyq = cdpycssgdhVarJyumaefscl.rgvfuqvkyq();
                int i13 = 0;
                while (true) {
                    long jWkgbmnqykc = cdpycssgdhVarJyumaefscl.agtfadlqog(i13, this.f11929jhduphickx).wkgbmnqykc();
                    if (j13 < jWkgbmnqykc) {
                        break;
                    }
                    if (i13 == iRgvfuqvkyq - 1) {
                        j13 = jWkgbmnqykc;
                        break;
                    } else {
                        j13 -= jWkgbmnqykc;
                        i13++;
                    }
                }
                esjtqupxsvVar.istkbnxepw(i13, j13);
            }
        } else if (esjtqupxsvVar.kcexrzcfyt(5)) {
            esjtqupxsvVar.dsvhmnatus(j13);
        }
        tbqsvytpvh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zeieaojujs() {
        if (jztzpxfvev() && this.f11954skhdrjzrfn && this.f11965wwaezpbzkn != null) {
            boolean zH = stevsuqkhv.h(this.f11903auzgnhcxok, this.f11939lxfrhoxuzk);
            Drawable drawable = zH ? this.f11946okpsazkaxt : this.f11934jztzpxfvev;
            int i13 = zH ? d5.zynmafqrjb.exo_controls_play_description : d5.zynmafqrjb.exo_controls_pause_description;
            this.f11965wwaezpbzkn.setImageDrawable(drawable);
            this.f11965wwaezpbzkn.setContentDescription(this.f11971yggfygwlhe.getString(i13));
            oipsdeybqn(stevsuqkhv.g(this.f11903auzgnhcxok), this.f11965wwaezpbzkn);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ntlheqmsrt(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public v2.esjtqupxsv getPlayer() {
        return this.f11903auzgnhcxok;
    }

    public int getRepeatToggleModes() {
        return this.f11915fyldjkxazc;
    }

    public boolean getShowShuffleButton() {
        return this.f11973zdlpuopuiu.pmvmpeiblj(this.f11906cllcsxoeiz);
    }

    public boolean getShowSubtitleButton() {
        return this.f11973zdlpuopuiu.pmvmpeiblj(this.f11966wypolnanlu);
    }

    public int getShowTimeoutMs() {
        return this.f11913fiwbwshyhd;
    }

    public boolean getShowVrButton() {
        return this.f11973zdlpuopuiu.pmvmpeiblj(this.f11910dsvhmnatus);
    }

    public boolean ikoacuggdj() {
        return this.f11973zdlpuopuiu.ylkuphrtab();
    }

    public void jlmebxxoox() {
        this.f11973zdlpuopuiu.istkbnxepw();
    }

    public boolean jztzpxfvev() {
        return getVisibility() == 0;
    }

    public boolean ntlheqmsrt(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar == null || !okpsazkaxt(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (esjtqupxsvVar.tzroggbefp() == 4 || !esjtqupxsvVar.kcexrzcfyt(12)) {
                return true;
            }
            esjtqupxsvVar.ribwqtqdhb();
            return true;
        }
        if (keyCode == 89 && esjtqupxsvVar.kcexrzcfyt(11)) {
            esjtqupxsvVar.vipkmwdibw();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            stevsuqkhv.lrnfpwlwnk(esjtqupxsvVar, this.f11939lxfrhoxuzk);
            return true;
        }
        if (keyCode == 87) {
            if (!esjtqupxsvVar.kcexrzcfyt(9)) {
                return true;
            }
            esjtqupxsvVar.esjtqupxsv();
            return true;
        }
        if (keyCode == 88) {
            if (!esjtqupxsvVar.kcexrzcfyt(7)) {
                return true;
            }
            esjtqupxsvVar.gtknphoqwx();
            return true;
        }
        if (keyCode == 126) {
            stevsuqkhv.weqkydbzbr(esjtqupxsvVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        stevsuqkhv.iyctptxqzt(esjtqupxsvVar);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11973zdlpuopuiu.dsvhmnatus();
        this.f11954skhdrjzrfn = true;
        if (ikoacuggdj()) {
            this.f11973zdlpuopuiu.sopmlzcsov();
        }
        zfvoamnweg();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11973zdlpuopuiu.wypolnanlu();
        this.f11954skhdrjzrfn = false;
        removeCallbacks(this.f11921ikoacuggdj);
        this.f11973zdlpuopuiu.ulzqkzuiru();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        this.f11973zdlpuopuiu.stevsuqkhv(z13, i13, i14, i15, i16);
    }

    public void ribwqtqdhb() {
        this.f11973zdlpuopuiu.iozdgvuglv();
    }

    public void setAnimationEnabled(boolean z13) {
        this.f11973zdlpuopuiu.crxdokpmqz(z13);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0170wkgbmnqykc interfaceC0170wkgbmnqykc) {
        this.f11926iwxlajgraz = interfaceC0170wkgbmnqykc;
        iyctptxqzt(this.f11956stevsuqkhv, interfaceC0170wkgbmnqykc != null);
        iyctptxqzt(this.f11935kegysxyocb, interfaceC0170wkgbmnqykc != null);
    }

    public void setPlayer(v2.esjtqupxsv esjtqupxsvVar) {
        y2.iobyxmoadg.lqeggnwhkg(Looper.myLooper() == Looper.getMainLooper());
        y2.iobyxmoadg.iobyxmoadg(esjtqupxsvVar == null || esjtqupxsvVar.iwizpuwonk() == Looper.getMainLooper());
        v2.esjtqupxsv esjtqupxsvVar2 = this.f11903auzgnhcxok;
        if (esjtqupxsvVar2 == esjtqupxsvVar) {
            return;
        }
        if (esjtqupxsvVar2 != null) {
            esjtqupxsvVar2.pmvmpeiblj(this.f11933jyumaefscl);
        }
        this.f11903auzgnhcxok = esjtqupxsvVar;
        if (esjtqupxsvVar != null) {
            esjtqupxsvVar.zynmafqrjb(this.f11933jyumaefscl);
        }
        zfvoamnweg();
    }

    public void setProgressUpdateListener(gxszxtbevo gxszxtbevoVar) {
    }

    public void setRepeatToggleModes(int i13) {
        this.f11915fyldjkxazc = i13;
        v2.esjtqupxsv esjtqupxsvVar = this.f11903auzgnhcxok;
        if (esjtqupxsvVar != null && esjtqupxsvVar.kcexrzcfyt(15)) {
            int iSopmlzcsov = this.f11903auzgnhcxok.sopmlzcsov();
            if (i13 == 0 && iSopmlzcsov != 0) {
                this.f11903auzgnhcxok.ntlheqmsrt(0);
            } else if (i13 == 1 && iSopmlzcsov == 2) {
                this.f11903auzgnhcxok.ntlheqmsrt(1);
            } else if (i13 == 2 && iSopmlzcsov == 1) {
                this.f11903auzgnhcxok.ntlheqmsrt(2);
            }
        }
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11918hkdspvbjdz, i13 != 0);
        roivzttewh();
    }

    public void setShowFastForwardButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11972ylkuphrtab, z13);
        lrnfpwlwnk();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z13) {
        this.f11920igdgnonuha = z13;
        skhdrjzrfn();
    }

    public void setShowNextButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11937lmojexxdyd, z13);
        lrnfpwlwnk();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z13) {
        this.f11939lxfrhoxuzk = z13;
        zeieaojujs();
    }

    public void setShowPreviousButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11922iozdgvuglv, z13);
        lrnfpwlwnk();
    }

    public void setShowRewindButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11948pkzmftpjix, z13);
        lrnfpwlwnk();
    }

    public void setShowShuffleButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11906cllcsxoeiz, z13);
        dvvnrvtcbc();
    }

    public void setShowSubtitleButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11966wypolnanlu, z13);
    }

    public void setShowTimeoutMs(int i13) {
        this.f11913fiwbwshyhd = i13;
        if (ikoacuggdj()) {
            this.f11973zdlpuopuiu.sopmlzcsov();
        }
    }

    public void setShowVrButton(boolean z13) {
        this.f11973zdlpuopuiu.jlmebxxoox(this.f11910dsvhmnatus, z13);
    }

    public void setTimeBarMinUpdateInterval(int i13) {
        this.f11902ageimvtcrz = stevsuqkhv.ojitshcjhn(i13, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f11910dsvhmnatus;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            oipsdeybqn(onClickListener != null, this.f11910dsvhmnatus);
        }
    }

    public void sflfametgt() {
        this.f11973zdlpuopuiu.jhduphickx();
    }

    public void tzroggbefp(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f11925iwizpuwonk.add(wflxmlrfwpVar);
    }

    public void uwvvkdfqfp(wflxmlrfwp wflxmlrfwpVar) {
        this.f11925iwizpuwonk.remove(wflxmlrfwpVar);
    }

    public void weqkydbzbr(boolean z13) {
        if (this.f11911dvvnrvtcbc == z13) {
            return;
        }
        this.f11911dvvnrvtcbc = z13;
        opjhrmiecq(this.f11956stevsuqkhv, z13);
        opjhrmiecq(this.f11935kegysxyocb, z13);
        InterfaceC0170wkgbmnqykc interfaceC0170wkgbmnqykc = this.f11926iwxlajgraz;
        if (interfaceC0170wkgbmnqykc != null) {
            interfaceC0170wkgbmnqykc.pkzmftpjix(z13);
        }
    }

    void xrmfcynszj() {
        Iterator it = this.f11925iwizpuwonk.iterator();
        while (it.hasNext()) {
            ((wflxmlrfwp) it.next()).istkbnxepw(getVisibility());
        }
    }

    void yfnezrywwk() {
        ImageView imageView = this.f11965wwaezpbzkn;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    void zfvoamnweg() {
        zeieaojujs();
        lrnfpwlwnk();
        roivzttewh();
        dvvnrvtcbc();
        igdgnonuha();
        nuxfzjnpeb();
        skhdrjzrfn();
    }
}
