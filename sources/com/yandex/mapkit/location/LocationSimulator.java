package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LocationSimulator extends LocationManager {
    List<SimulationSettings> getSettings();

    @Deprecated
    double getSpeed();

    boolean isActive();

    PolylinePosition polylinePosition();

    void setSettings(List<SimulationSettings> list);

    @Deprecated
    void setSpeed(double d13);

    void startSimulation(List<SimulationSettings> list);

    void stopSimulation();

    void subscribeForSimulatorEvents(LocationSimulatorListener locationSimulatorListener);

    void unsubscribeFromSimulatorEvents(LocationSimulatorListener locationSimulatorListener);
}
