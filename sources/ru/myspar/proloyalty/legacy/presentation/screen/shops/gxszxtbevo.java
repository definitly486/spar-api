package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b31.btonecajqb;
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
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.shops.store.ShopsArgs;
import vk0.lqeggnwhkg;
import z41.wwaezpbzkn;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends tr0.iobyxmoadg implements d8.zoijcleaow, MapObjectTapListener {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f97393esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f97394lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CameraListener f97395cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f97396iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final q11.iobyxmoadg f97397jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f97398iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f97399zoijcleaow;

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
            f97398iobyxmoadg = iArr;
            int[] iArr2 = new int[ShopsArgs.zoijcleaow.values().length];
            try {
                iArr2[ShopsArgs.zoijcleaow.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShopsArgs.zoijcleaow.SPECIAL_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f97399zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, q11.iobyxmoadg distanceUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(distanceUtils, "distanceUtils");
        this.f97397jyumaefscl = distanceUtils;
        this.f97396iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: mb1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.kegysxyocb(this.f66763zdlpuopuiu);
            }
        });
        this.f97395cqumvgiudr = new CameraListener() { // from class: mb1.btonecajqb
            @Override // com.yandex.mapkit.map.CameraListener
            public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z13) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.oxmwwwfdhm(this.f66757iobyxmoadg, map, cameraPosition, cameraUpdateReason, z13);
            }
        };
        final wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) binding.invoke();
        ComposeView cvActionBar = wwaezpbzknVar.f128460gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_shops_caption);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: mb1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.zynmafqrjb(this.f66760zdlpuopuiu);
            }
        }, null, null, 109, null);
        wwaezpbzknVar.f128463nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: mb1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.istkbnxepw(this.f66758zdlpuopuiu, view);
            }
        });
        wwaezpbzknVar.f128454agtfadlqog.setOnClickListener(new View.OnClickListener() { // from class: mb1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.cdpycssgdh(this.f66771zdlpuopuiu, view);
            }
        });
        wwaezpbzknVar.f128465wflxmlrfwp.setOnClickListener(new View.OnClickListener() { // from class: mb1.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.yadqdtsiqt(this.f66756zdlpuopuiu, view);
            }
        });
        wwaezpbzknVar.f128455btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        wwaezpbzknVar.f128455btonecajqb.setAdapter(cqumvgiudr());
        wwaezpbzknVar.f128467zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: mb1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.iozdgvuglv(this.f66765zdlpuopuiu, wwaezpbzknVar, view);
            }
        });
        wwaezpbzknVar.f128466wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: mb1.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.esjtqupxsv(wwaezpbzknVar, this, view);
            }
        });
        wwaezpbzknVar.f128464ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: mb1.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.lereixgezr(wwaezpbzknVar, this, view);
            }
        });
        wwaezpbzknVar.f128457dxjokdxxww.getMap().setNightModeEnabled(p41.ppxfxbqfkf.eablkybsjg(wkgbmnqykc()));
        wwaezpbzknVar.f128455btonecajqb.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mb1.oxmwwwfdhm
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.pmvmpeiblj(this.f66766iobyxmoadg, view, i13, i14, i15, i16, i17, i18, i19, i23);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cdpycssgdh(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gtknphoqwx.f97424iobyxmoadg);
    }

    private final nb1.iobyxmoadg cqumvgiudr() {
        return (nb1.iobyxmoadg) this.f97396iwizpuwonk.getValue();
    }

    private final void dsvhmnatus(wwaezpbzkn wwaezpbzknVar, List list, Point point, boolean z13) {
        MapView mapView = wwaezpbzknVar.f128457dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(mapView, "mapView");
        tt0.iobyxmoadg.iobyxmoadg(mapView);
        stevsuqkhv(wwaezpbzknVar, list, z13);
        if (point != null) {
            wypolnanlu(wwaezpbzknVar, point.getLatitude(), point.getLongitude());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar, View view) {
        if (wwaezpbzknVar.f128459gtknphoqwx.getCheckedButtonId() != -1) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.agtfadlqog.f97416iobyxmoadg);
        } else {
            wwaezpbzknVar.f128459gtknphoqwx.eablkybsjg(vk0.wkgbmnqykc.btnOnMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(gxszxtbevo gxszxtbevoVar, wwaezpbzkn wwaezpbzknVar, View view) {
        CameraPosition cameraPosition = wwaezpbzknVar.f128457dxjokdxxww.getMap().getCameraPosition();
        zdlpuopuiu.dxjokdxxww(cameraPosition, "getCameraPosition(...)");
        MapView mapView = wwaezpbzknVar.f128457dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(mapView, "mapView");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(cameraPosition, mapView.getVisibility() == 0 ? wwaezpbzknVar.f128457dxjokdxxww.getMapWindow().getFocusRegion() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.lqeggnwhkg.f97428iobyxmoadg);
    }

    private final int iwizpuwonk(boolean z13) {
        return z13 ? btonecajqb.marker_sg : btonecajqb.marker;
    }

    private final void jyumaefscl(wwaezpbzkn wwaezpbzknVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        int i13 = zoijcleaow.f97398iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            wwaezpbzknVar.f128459gtknphoqwx.eablkybsjg(vk0.wkgbmnqykc.btnOnMap);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            wwaezpbzknVar.f128459gtknphoqwx.eablkybsjg(vk0.wkgbmnqykc.btnInList);
        }
    }

    private final void kcexrzcfyt(wwaezpbzkn wwaezpbzknVar, float f13, CameraPosition cameraPosition) {
        wwaezpbzknVar.f128457dxjokdxxww.getMap().move(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - f13, cameraPosition.getAzimuth(), cameraPosition.getTilt()), new Animation(Animation.Type.SMOOTH, 0.0f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nb1.iobyxmoadg kegysxyocb(final gxszxtbevo gxszxtbevoVar) {
        return new nb1.iobyxmoadg(new tg.draadjrbmk() { // from class: mb1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo.tzroggbefp(this.f66759zdlpuopuiu, (l91.wkgbmnqykc) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lereixgezr(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar, View view) {
        if (wwaezpbzknVar.f128459gtknphoqwx.getCheckedButtonId() == -1) {
            wwaezpbzknVar.f128459gtknphoqwx.eablkybsjg(vk0.wkgbmnqykc.btnInList);
            return;
        }
        VisibleRegion focusRegion = wwaezpbzknVar.f128457dxjokdxxww.getMapWindow().getFocusRegion();
        zdlpuopuiu.dxjokdxxww(focusRegion, "getFocusRegion(...)");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.wflxmlrfwp(focusRegion));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(gxszxtbevo gxszxtbevoVar, Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z13) {
        zdlpuopuiu.btonecajqb(map, "<unused var>");
        zdlpuopuiu.btonecajqb(cameraPosition, "<unused var>");
        zdlpuopuiu.btonecajqb(cameraUpdateReason, "cameraUpdateReason");
        if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f97432iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(gxszxtbevo gxszxtbevoVar, View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f97425iobyxmoadg);
    }

    private final void stevsuqkhv(wwaezpbzkn wwaezpbzknVar, List list, boolean z13) {
        int iIwizpuwonk = iwizpuwonk(z13);
        RootMapObjectCollection mapObjects = wwaezpbzknVar.f128457dxjokdxxww.getMap().getMapObjects();
        ImageProvider imageProviderFromResource = ImageProvider.fromResource(wkgbmnqykc(), iIwizpuwonk);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l91.wkgbmnqykc wkgbmnqykcVar = (l91.wkgbmnqykc) it.next();
            mapObjects.addPlacemark(wkgbmnqykcVar.eablkybsjg(), imageProviderFromResource).setUserData(wkgbmnqykcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn tzroggbefp(gxszxtbevo gxszxtbevoVar, l91.wkgbmnqykc it) {
        zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.dxjokdxxww(it, true));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wypolnanlu(wwaezpbzkn wwaezpbzknVar, double d13, double d14) {
        Bitmap bitmapIobyxmoadg = tt0.zoijcleaow.iobyxmoadg(wkgbmnqykc(), b31.gxszxtbevo.ic_user_location_map_pin);
        if (bitmapIobyxmoadg != null) {
            PlacemarkMapObject placemarkMapObjectAddPlacemark = wwaezpbzknVar.f128457dxjokdxxww.getMap().getMapObjects().addPlacemark(new Point(d13, d14), ImageProvider.fromBitmap(bitmapIobyxmoadg));
            placemarkMapObjectAddPlacemark.setZIndex(1.0f);
            placemarkMapObjectAddPlacemark.setIconStyle(new IconStyle().setAnchor(new PointF(0.5f, 0.5f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.btonecajqb.f97417iobyxmoadg);
    }

    static /* synthetic */ void zdlpuopuiu(gxszxtbevo gxszxtbevoVar, wwaezpbzkn wwaezpbzknVar, float f13, CameraPosition cameraPosition, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0.8f;
        }
        if ((i13 & 2) != 0) {
            cameraPosition = wwaezpbzknVar.f128457dxjokdxxww.getMap().getCameraPosition();
        }
        gxszxtbevoVar.kcexrzcfyt(wwaezpbzknVar, f13, cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97433iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(wwaezpbzkn binding, wkgbmnqykc model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f128458eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.lqeggnwhkg());
        jyumaefscl(binding, model.zoijcleaow());
        RecyclerView rvShops = binding.f128455btonecajqb;
        zdlpuopuiu.dxjokdxxww(rvShops, "rvShops");
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarZoijcleaow = model.zoijcleaow();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.LIST;
        rvShops.setVisibility(iobyxmoadgVarZoijcleaow == iobyxmoadgVar ? 0 : 8);
        Group groupMap = binding.f128462lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(groupMap, "groupMap");
        groupMap.setVisibility(model.zoijcleaow() == wkgbmnqykc.iobyxmoadg.MAP ? 0 : 8);
        MaterialTextView tvEmptyListError = binding.f128456draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvEmptyListError, "tvEmptyListError");
        tvEmptyListError.setVisibility(model.eablkybsjg().isEmpty() && model.zoijcleaow() == iobyxmoadgVar ? 0 : 8);
        binding.f128456draadjrbmk.setText(model.iobyxmoadg() ? lqeggnwhkg.proloyalty_shop_empty_filtration_message : lqeggnwhkg.proloyalty_shop_empty_region_message);
        cqumvgiudr().wkgbmnqykc(model.eablkybsjg());
        binding.f128467zoijcleaow.setSelected(model.iobyxmoadg());
        dsvhmnatus(binding, model.ppxfxbqfkf(), model.wkgbmnqykc(), model.gxszxtbevo());
        if (model.nufgyqmvbu()) {
            binding.f128455btonecajqb.A(0);
            ppxfxbqfkf(ppxfxbqfkf.draadjrbmk.f97418iobyxmoadg);
        }
    }

    public final void hcddaimhww(Point point) {
        zdlpuopuiu.btonecajqb(point, "point");
        ppxfxbqfkf(new ppxfxbqfkf.nufgyqmvbu(point));
    }

    public final void hkdspvbjdz(wwaezpbzkn binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f128457dxjokdxxww.onStop();
        MapKitFactory.getInstance().onStop();
        binding.f128457dxjokdxxww.getMap().getMapObjects().removeTapListener(this);
        binding.f128457dxjokdxxww.getMap().removeCameraListener(this.f97395cqumvgiudr);
    }

    public final void jpowsppfya(wwaezpbzkn binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f128457dxjokdxxww.onStart();
        MapKitFactory.getInstance().onStart();
        binding.f128457dxjokdxxww.getMap().getMapObjects().addTapListener(this);
        binding.f128457dxjokdxxww.getMap().addCameraListener(this.f97395cqumvgiudr);
    }

    public final void lmojexxdyd(wwaezpbzkn binding, CameraPosition cameraPosition) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        kcexrzcfyt(binding, 0.0f, cameraPosition);
    }

    public final void mbcevpiqjq(wwaezpbzkn binding, Point position) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(position, "position");
        CameraPosition cameraPosition = binding.f128457dxjokdxxww.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(this.f97397jyumaefscl.iobyxmoadg(position, 0.1d)));
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
        zdlpuopuiu.nufgyqmvbu(userData, "null cannot be cast to non-null type ru.myspar.proloyalty.legacy.presentation.model.ShopUiModel");
        ppxfxbqfkf(new ppxfxbqfkf.dxjokdxxww((l91.wkgbmnqykc) userData, false, 2, null));
        return true;
    }

    public final void pkzmftpjix(VisibleRegion visibleRegion, l91.wkgbmnqykc shop, boolean z13) {
        zdlpuopuiu.btonecajqb(shop, "shop");
        ppxfxbqfkf(new ppxfxbqfkf.eablkybsjg(visibleRegion, shop, z13));
    }

    public final void wwaezpbzkn(wwaezpbzkn binding, Point position, double d13, ShopsArgs.zoijcleaow shopsFlow) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(position, "position");
        zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
        int i13 = zoijcleaow.f97399zoijcleaow[shopsFlow.ordinal()];
        if (i13 == 1) {
            MapView mapView = binding.f128457dxjokdxxww;
            zdlpuopuiu.dxjokdxxww(mapView, "mapView");
            tt0.iobyxmoadg.wkgbmnqykc(mapView, position, true, (float) d13, true);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            CameraPosition cameraPosition = binding.f128457dxjokdxxww.getMap().cameraPosition(Geometry.fromBoundingBox(this.f97397jyumaefscl.iobyxmoadg(position, d13)));
            zdlpuopuiu.dxjokdxxww(cameraPosition, "cameraPosition(...)");
            zdlpuopuiu(this, binding, 0.0f, cameraPosition, 1, null);
        }
    }

    public final void yggfygwlhe(wwaezpbzkn binding, boolean z13) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu(this, binding, z13 ? -1.0f : 1.0f, null, 2, null);
    }

    public final void ylkuphrtab() {
        ppxfxbqfkf(ppxfxbqfkf.C2302ppxfxbqfkf.f97430iobyxmoadg);
    }
}
