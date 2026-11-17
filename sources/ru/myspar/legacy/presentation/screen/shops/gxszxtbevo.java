package ru.myspar.legacy.presentation.screen.shops;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.dsvhmnatus;
import pm.dxjokdxxww;
import ru.myspar.domain.feature.shops.store.ShopsArgs;
import s40.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends zs.iobyxmoadg implements d8.zoijcleaow, MapObjectTapListener {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f89763esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f89764lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CameraListener f89765cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f89766iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final k30.iobyxmoadg f89767jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f89768iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f89769zoijcleaow;

        static {
            int[] iArr = new int[wkgbmnqykc.iobyxmoadg.values().length];
            try {
                iArr[wkgbmnqykc.iobyxmoadg.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wkgbmnqykc.iobyxmoadg.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89768iobyxmoadg = iArr;
            int[] iArr2 = new int[ShopsArgs.zoijcleaow.values().length];
            try {
                iArr2[ShopsArgs.zoijcleaow.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShopsArgs.zoijcleaow.SPECIAL_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f89769zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, k30.iobyxmoadg distanceUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(distanceUtils, "distanceUtils");
        this.f89767jyumaefscl = distanceUtils;
        this.f89766iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: qd0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.kegysxyocb(this.f78606zdlpuopuiu);
            }
        });
        this.f89765cqumvgiudr = new CameraListener() { // from class: qd0.btonecajqb
            @Override // com.yandex.mapkit.map.CameraListener
            public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z13) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.oxmwwwfdhm(this.f78600iobyxmoadg, map, cameraPosition, cameraUpdateReason, z13);
            }
        };
        final dsvhmnatus dsvhmnatusVar = (dsvhmnatus) binding.invoke();
        ComposeView cvActionBar = dsvhmnatusVar.f65454gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.shops_caption);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: qd0.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.zynmafqrjb(this.f78603zdlpuopuiu);
            }
        }, null, null, 109, null);
        dsvhmnatusVar.f65457nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: qd0.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.istkbnxepw(this.f78601zdlpuopuiu, view);
            }
        });
        dsvhmnatusVar.f65448agtfadlqog.setOnClickListener(new View.OnClickListener() { // from class: qd0.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.cdpycssgdh(this.f78614zdlpuopuiu, view);
            }
        });
        dsvhmnatusVar.f65459wflxmlrfwp.setOnClickListener(new View.OnClickListener() { // from class: qd0.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.yadqdtsiqt(this.f78599zdlpuopuiu, view);
            }
        });
        dsvhmnatusVar.f65449btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        dsvhmnatusVar.f65449btonecajqb.setAdapter(cqumvgiudr());
        dsvhmnatusVar.f65461zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: qd0.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.iozdgvuglv(this.f78608zdlpuopuiu, dsvhmnatusVar, view);
            }
        });
        dsvhmnatusVar.f65460wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: qd0.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.esjtqupxsv(dsvhmnatusVar, this, view);
            }
        });
        dsvhmnatusVar.f65458ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: qd0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.lereixgezr(dsvhmnatusVar, this, view);
            }
        });
        dsvhmnatusVar.f65451dxjokdxxww.getMap().setNightModeEnabled(c60.zoijcleaow.eablkybsjg(wkgbmnqykc()));
        dsvhmnatusVar.f65449btonecajqb.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: qd0.oxmwwwfdhm
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
                ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.pmvmpeiblj(this.f78609iobyxmoadg, view, i13, i14, i15, i16, i17, i18, i19, i23);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cdpycssgdh(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gtknphoqwx.f89794iobyxmoadg);
    }

    private final rd0.iobyxmoadg cqumvgiudr() {
        return (rd0.iobyxmoadg) this.f89766iwizpuwonk.getValue();
    }

    private final void dsvhmnatus(dsvhmnatus dsvhmnatusVar, List list, Point point, boolean z13) {
        MapView mapView = dsvhmnatusVar.f65451dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(mapView, "mapView");
        zu.iobyxmoadg.iobyxmoadg(mapView);
        stevsuqkhv(dsvhmnatusVar, list, z13);
        if (point != null) {
            wypolnanlu(dsvhmnatusVar, point.getLatitude(), point.getLongitude());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(dsvhmnatus dsvhmnatusVar, gxszxtbevo gxszxtbevoVar, View view) {
        if (dsvhmnatusVar.f65453gtknphoqwx.getCheckedButtonId() != -1) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.agtfadlqog.f89786iobyxmoadg);
        } else {
            dsvhmnatusVar.f65453gtknphoqwx.eablkybsjg(pm.eablkybsjg.btnOnMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(gxszxtbevo gxszxtbevoVar, dsvhmnatus dsvhmnatusVar, View view) {
        CameraPosition cameraPosition = dsvhmnatusVar.f65451dxjokdxxww.getMap().getCameraPosition();
        zdlpuopuiu.dxjokdxxww(cameraPosition, "getCameraPosition(...)");
        MapView mapView = dsvhmnatusVar.f65451dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(mapView, "mapView");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(cameraPosition, mapView.getVisibility() == 0 ? dsvhmnatusVar.f65451dxjokdxxww.getMapWindow().getFocusRegion() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.lqeggnwhkg.f89798iobyxmoadg);
    }

    private final int iwizpuwonk(boolean z13) {
        return z13 ? btonecajqb.marker_sg : btonecajqb.marker;
    }

    private final void jyumaefscl(dsvhmnatus dsvhmnatusVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        int i13 = zoijcleaow.f89768iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            dsvhmnatusVar.f65453gtknphoqwx.eablkybsjg(pm.eablkybsjg.btnOnMap);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dsvhmnatusVar.f65453gtknphoqwx.eablkybsjg(pm.eablkybsjg.btnInList);
        }
    }

    private final void kcexrzcfyt(dsvhmnatus dsvhmnatusVar, float f13, CameraPosition cameraPosition) {
        dsvhmnatusVar.f65451dxjokdxxww.getMap().move(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - f13, cameraPosition.getAzimuth(), cameraPosition.getTilt()), new Animation(Animation.Type.SMOOTH, 0.0f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rd0.iobyxmoadg kegysxyocb(final gxszxtbevo gxszxtbevoVar) {
        return new rd0.iobyxmoadg(new tg.draadjrbmk() { // from class: qd0.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shops.gxszxtbevo.tzroggbefp(this.f78602zdlpuopuiu, (mb0.wkgbmnqykc) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lereixgezr(dsvhmnatus dsvhmnatusVar, gxszxtbevo gxszxtbevoVar, View view) {
        if (dsvhmnatusVar.f65453gtknphoqwx.getCheckedButtonId() == -1) {
            dsvhmnatusVar.f65453gtknphoqwx.eablkybsjg(pm.eablkybsjg.btnInList);
            return;
        }
        VisibleRegion focusRegion = dsvhmnatusVar.f65451dxjokdxxww.getMapWindow().getFocusRegion();
        zdlpuopuiu.dxjokdxxww(focusRegion, "getFocusRegion(...)");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.wflxmlrfwp(focusRegion));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(gxszxtbevo gxszxtbevoVar, Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z13) {
        zdlpuopuiu.btonecajqb(map, "<unused var>");
        zdlpuopuiu.btonecajqb(cameraPosition, "<unused var>");
        zdlpuopuiu.btonecajqb(cameraUpdateReason, "cameraUpdateReason");
        if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f89802iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(gxszxtbevo gxszxtbevoVar, View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f89795iobyxmoadg);
    }

    private final void stevsuqkhv(dsvhmnatus dsvhmnatusVar, List list, boolean z13) {
        int iIwizpuwonk = iwizpuwonk(z13);
        RootMapObjectCollection mapObjects = dsvhmnatusVar.f65451dxjokdxxww.getMap().getMapObjects();
        ImageProvider imageProviderFromResource = ImageProvider.fromResource(wkgbmnqykc(), iIwizpuwonk);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mb0.wkgbmnqykc wkgbmnqykcVar = (mb0.wkgbmnqykc) it.next();
            mapObjects.addPlacemark(wkgbmnqykcVar.eablkybsjg(), imageProviderFromResource).setUserData(wkgbmnqykcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(gxszxtbevo gxszxtbevoVar, mb0.wkgbmnqykc it) {
        zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.dxjokdxxww(it, true));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wypolnanlu(dsvhmnatus dsvhmnatusVar, double d13, double d14) {
        Bitmap bitmapIobyxmoadg = zu.zoijcleaow.iobyxmoadg(wkgbmnqykc(), s40.gxszxtbevo.ic_user_location_map_pin);
        if (bitmapIobyxmoadg != null) {
            PlacemarkMapObject placemarkMapObjectAddPlacemark = dsvhmnatusVar.f65451dxjokdxxww.getMap().getMapObjects().addPlacemark(new Point(d13, d14), ImageProvider.fromBitmap(bitmapIobyxmoadg));
            placemarkMapObjectAddPlacemark.setZIndex(1.0f);
            placemarkMapObjectAddPlacemark.setIconStyle(new IconStyle().setAnchor(new PointF(0.5f, 0.5f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.btonecajqb.f89787iobyxmoadg);
    }

    static /* synthetic */ void zdlpuopuiu(gxszxtbevo gxszxtbevoVar, dsvhmnatus dsvhmnatusVar, float f13, CameraPosition cameraPosition, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0.8f;
        }
        if ((i13 & 2) != 0) {
            cameraPosition = dsvhmnatusVar.f65451dxjokdxxww.getMap().getCameraPosition();
        }
        gxszxtbevoVar.kcexrzcfyt(dsvhmnatusVar, f13, cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89803iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(dsvhmnatus binding, wkgbmnqykc model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f65452eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.lqeggnwhkg());
        jyumaefscl(binding, model.zoijcleaow());
        RecyclerView rvShops = binding.f65449btonecajqb;
        zdlpuopuiu.dxjokdxxww(rvShops, "rvShops");
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarZoijcleaow = model.zoijcleaow();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.LIST;
        rvShops.setVisibility(iobyxmoadgVarZoijcleaow == iobyxmoadgVar ? 0 : 8);
        Group groupMap = binding.f65456lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(groupMap, "groupMap");
        groupMap.setVisibility(model.zoijcleaow() == wkgbmnqykc.iobyxmoadg.MAP ? 0 : 8);
        MaterialTextView tvEmptyListError = binding.f65450draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvEmptyListError, "tvEmptyListError");
        tvEmptyListError.setVisibility(model.eablkybsjg().isEmpty() && model.zoijcleaow() == iobyxmoadgVar ? 0 : 8);
        binding.f65450draadjrbmk.setText(model.iobyxmoadg() ? dxjokdxxww.shop_empty_filtration_message : dxjokdxxww.shop_empty_region_message);
        cqumvgiudr().wkgbmnqykc(model.eablkybsjg());
        binding.f65461zoijcleaow.setSelected(model.iobyxmoadg());
        dsvhmnatus(binding, model.ppxfxbqfkf(), model.wkgbmnqykc(), model.gxszxtbevo());
        if (model.nufgyqmvbu()) {
            binding.f65449btonecajqb.A(0);
            ppxfxbqfkf(ppxfxbqfkf.draadjrbmk.f89788iobyxmoadg);
        }
    }

    public final void hcddaimhww(Point point) {
        zdlpuopuiu.btonecajqb(point, "point");
        ppxfxbqfkf(new ppxfxbqfkf.nufgyqmvbu(point));
    }

    public final void hkdspvbjdz(dsvhmnatus binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f65451dxjokdxxww.onStop();
        MapKitFactory.getInstance().onStop();
        binding.f65451dxjokdxxww.getMap().getMapObjects().removeTapListener(this);
        binding.f65451dxjokdxxww.getMap().removeCameraListener(this.f89765cqumvgiudr);
    }

    public final void jpowsppfya(dsvhmnatus binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f65451dxjokdxxww.onStart();
        MapKitFactory.getInstance().onStart();
        binding.f65451dxjokdxxww.getMap().getMapObjects().addTapListener(this);
        binding.f65451dxjokdxxww.getMap().addCameraListener(this.f89765cqumvgiudr);
    }

    public final void lmojexxdyd(dsvhmnatus binding, CameraPosition cameraPosition) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        kcexrzcfyt(binding, 0.0f, cameraPosition);
    }

    public final void mbcevpiqjq(dsvhmnatus binding, Point position) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(position, "position");
        CameraPosition cameraPosition = binding.f65451dxjokdxxww.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(this.f89767jyumaefscl.iobyxmoadg(position, 0.1d)));
        zdlpuopuiu.dxjokdxxww(cameraPosition, "cameraPosition(...)");
        zdlpuopuiu(this, binding, 0.0f, cameraPosition, 1, null);
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public boolean onMapObjectTap(MapObject mapObject, Point point) {
        zdlpuopuiu.btonecajqb(mapObject, "mapObject");
        zdlpuopuiu.btonecajqb(point, "point");
        if (mapObject.getUserData() == null) {
            return false;
        }
        Object userData = mapObject.getUserData();
        zdlpuopuiu.nufgyqmvbu(userData, "null cannot be cast to non-null type ru.myspar.legacy.presentation.model.ShopUiModel");
        ppxfxbqfkf(new ppxfxbqfkf.dxjokdxxww((mb0.wkgbmnqykc) userData, false, 2, null));
        return true;
    }

    public final void pkzmftpjix(VisibleRegion visibleRegion, mb0.wkgbmnqykc shop, boolean z13) {
        zdlpuopuiu.btonecajqb(shop, "shop");
        ppxfxbqfkf(new ppxfxbqfkf.eablkybsjg(visibleRegion, shop, z13));
    }

    public final void wwaezpbzkn(dsvhmnatus binding, Point position, double d13, ShopsArgs.zoijcleaow shopsFlow) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(position, "position");
        zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
        int i13 = zoijcleaow.f89769zoijcleaow[shopsFlow.ordinal()];
        if (i13 == 1) {
            MapView mapView = binding.f65451dxjokdxxww;
            zdlpuopuiu.dxjokdxxww(mapView, "mapView");
            zu.iobyxmoadg.wkgbmnqykc(mapView, position, true, (float) d13, true);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            CameraPosition cameraPosition = binding.f65451dxjokdxxww.getMap().cameraPosition(Geometry.fromBoundingBox(this.f89767jyumaefscl.iobyxmoadg(position, d13)));
            zdlpuopuiu.dxjokdxxww(cameraPosition, "cameraPosition(...)");
            zdlpuopuiu(this, binding, 0.0f, cameraPosition, 1, null);
        }
    }

    public final void yggfygwlhe(dsvhmnatus binding, boolean z13) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu(this, binding, z13 ? -1.0f : 1.0f, null, 2, null);
    }

    public final void ylkuphrtab() {
        ppxfxbqfkf(ppxfxbqfkf.C2062ppxfxbqfkf.f89800iobyxmoadg);
    }
}
