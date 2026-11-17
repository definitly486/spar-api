package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static HashMap f7812zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private HashMap f7813iobyxmoadg = new HashMap();

    static {
        HashMap map = new HashMap();
        f7812zoijcleaow = map;
        try {
            map.put("KeyAttribute", wkgbmnqykc.class.getConstructor(null));
            f7812zoijcleaow.put("KeyPosition", lqeggnwhkg.class.getConstructor(null));
            f7812zoijcleaow.put("KeyCycle", eablkybsjg.class.getConstructor(null));
            f7812zoijcleaow.put("KeyTimeCycle", dxjokdxxww.class.getConstructor(null));
            f7812zoijcleaow.put("KeyTrigger", btonecajqb.class.getConstructor(null));
        } catch (NoSuchMethodException e13) {
            Log.e("KeyFrames", "unable to load", e13);
        }
    }

    public gxszxtbevo() {
    }

    public void iobyxmoadg(draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = (ArrayList) this.f7813iobyxmoadg.get(-1);
        if (arrayList != null) {
            draadjrbmkVar.zoijcleaow(arrayList);
        }
    }

    public void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f7813iobyxmoadg.containsKey(Integer.valueOf(ppxfxbqfkfVar.f7926zoijcleaow))) {
            this.f7813iobyxmoadg.put(Integer.valueOf(ppxfxbqfkfVar.f7926zoijcleaow), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f7813iobyxmoadg.get(Integer.valueOf(ppxfxbqfkfVar.f7926zoijcleaow));
        if (arrayList != null) {
            arrayList.add(ppxfxbqfkfVar);
        }
    }

    public ArrayList wkgbmnqykc(int i13) {
        return (ArrayList) this.f7813iobyxmoadg.get(Integer.valueOf(i13));
    }

    public void zoijcleaow(draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = (ArrayList) this.f7813iobyxmoadg.get(Integer.valueOf(draadjrbmkVar.f7729ppxfxbqfkf));
        if (arrayList != null) {
            draadjrbmkVar.zoijcleaow(arrayList);
        }
        ArrayList<ppxfxbqfkf> arrayList2 = (ArrayList) this.f7813iobyxmoadg.get(-1);
        if (arrayList2 != null) {
            for (ppxfxbqfkf ppxfxbqfkfVar : arrayList2) {
                if (ppxfxbqfkfVar.gxszxtbevo(((ConstraintLayout.zoijcleaow) draadjrbmkVar.f7739zoijcleaow.getLayoutParams()).f8019ikoacuggdj)) {
                    draadjrbmkVar.iobyxmoadg(ppxfxbqfkfVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public gxszxtbevo(Context context, XmlPullParser xmlPullParser) {
        HashMap map;
        HashMap map2;
        byte b13;
        ppxfxbqfkf wkgbmnqykcVar;
        try {
            int eventType = xmlPullParser.getEventType();
            ppxfxbqfkf ppxfxbqfkfVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f7812zoijcleaow.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    b13 = -1;
                                } else {
                                    b13 = 3;
                                }
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    b13 = -1;
                                } else {
                                    b13 = 0;
                                }
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    b13 = -1;
                                } else {
                                    b13 = 2;
                                }
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    b13 = -1;
                                } else {
                                    b13 = 1;
                                }
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    b13 = -1;
                                } else {
                                    b13 = 4;
                                }
                                break;
                            default:
                                b13 = -1;
                                break;
                        }
                        if (b13 == 0) {
                            wkgbmnqykcVar = new wkgbmnqykc();
                        } else if (b13 == 1) {
                            wkgbmnqykcVar = new lqeggnwhkg();
                        } else if (b13 == 2) {
                            wkgbmnqykcVar = new eablkybsjg();
                        } else if (b13 == 3) {
                            wkgbmnqykcVar = new dxjokdxxww();
                        } else if (b13 == 4) {
                            wkgbmnqykcVar = new btonecajqb();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        wkgbmnqykcVar.eablkybsjg(context, Xml.asAttributeSet(xmlPullParser));
                        ppxfxbqfkf(wkgbmnqykcVar);
                        ppxfxbqfkfVar = wkgbmnqykcVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (ppxfxbqfkfVar != null && (map2 = ppxfxbqfkfVar.f7922eablkybsjg) != null) {
                            androidx.constraintlayout.widget.iobyxmoadg.dxjokdxxww(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && ppxfxbqfkfVar != null && (map = ppxfxbqfkfVar.f7922eablkybsjg) != null) {
                        androidx.constraintlayout.widget.iobyxmoadg.dxjokdxxww(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            Log.e("KeyFrames", "Error parsing XML resource", e13);
        } catch (XmlPullParserException e14) {
            Log.e("KeyFrames", "Error parsing XML resource", e14);
        }
    }
}
