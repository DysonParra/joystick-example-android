/*
 * @fileoverview    {ButtonAction}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.example.joystick.mobile.buttonaction;

import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.project.dev.joystick.GenericComponent.BUTTON_TYPED;
import static com.project.dev.joystick.GenericComponent.BUTTON_PRESSED;
import static com.project.dev.joystick.GenericComponent.BUTTON_RELEASED;
import static com.project.dev.joystick.GenericComponent.BUTTON_UNPRESSED;

import com.project.dev.example.joystick.mobile.activity.ExampleActivity;
import com.project.dev.example.joystick.mobile.getter.GraphicGetter;
import com.project.dev.example.joystick.mobile.setter.GenericJoystickComponentActionSetter;

/**
 * TODO: Description of {@code ButtonAction}.
 *
 * @author Dyson Parra
 * @since 11
 */
public class ButtonAction {

    private static int buttonLeftImageNumber = 0;
    private static int buttonRightImageNumber = -1;
    private static int buttonUpImageNumber = -1;
    private static int buttonDownImageNumber = -1;

    /**
     * FIXME: Description of {@code runButtonStartAction}. Ejecuta la acción para el botón start.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonStartAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonSelectAction}. Ejecuta la acción para el botón select.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonSelectAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonMoveLeftAction}. Ejecuta la acción para el botón flecha
     * izquierda.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonMoveLeftAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                final LinearLayout.LayoutParams viewParams = (LinearLayout.LayoutParams) actionSetter.getComponent().getLayoutParams();
                final ImageView component = actionSetter.getComponent();
                if (viewParams.leftMargin >= component.getWidth() / 10) {
                    actionSetter.getWindow().runOnUiThread(new Runnable() {
                        public void run() {
                            viewParams.leftMargin -= component.getWidth() / 10;
                            component.setLayoutParams(viewParams);
                        }
                    });
                }
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonMoveRightAction}. Ejecuta la acción para el botón flecha
     * derecha.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonMoveRightAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                final LinearLayout.LayoutParams viewParams = (LinearLayout.LayoutParams) actionSetter.getComponent().getLayoutParams();
                final ImageView component = actionSetter.getComponent();
                if (viewParams.leftMargin + component.getWidth() <= actionSetter.getWindowWidth()) {
                    actionSetter.getWindow().runOnUiThread(new Runnable() {
                        public void run() {
                            viewParams.leftMargin += component.getWidth() / 10;
                            component.requestLayout();
                        }
                    });
                }
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonMoveUpAction}. Ejecuta la acción para el botón flecha
     * arriba.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonMoveUpAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                final LinearLayout.LayoutParams viewParams = (LinearLayout.LayoutParams) actionSetter.getComponent().getLayoutParams();
                final ImageView component = actionSetter.getComponent();
                if (viewParams.topMargin >= component.getHeight() / 10) {
                    viewParams.topMargin -= component.getHeight() / 10;
                    actionSetter.getWindow().runOnUiThread(new Runnable() {
                        public void run() {
                            component.invalidate();
                            component.requestLayout();
                        }
                    });
                }
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonMoveDownAction}. Ejecuta la acción para el botón flecha
     * abajo.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonMoveDownAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                final LinearLayout.LayoutParams viewParams = (LinearLayout.LayoutParams) actionSetter.getComponent().getLayoutParams();
                final ImageView component = actionSetter.getComponent();
                if (viewParams.topMargin + component.getHeight() + (component.getHeight() / 10) <= actionSetter.getWindowHeight()) {
                    viewParams.topMargin += component.getHeight() / 10;
                    actionSetter.getWindow().runOnUiThread(new Runnable() {
                        public void run() {
                            component.invalidate();
                            component.requestLayout();
                        }
                    });
                }
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonMoveMediumAction}. Ejecuta la acción para el botón
     * flecha intermedia.
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonMoveMediumAction(GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonLeftAction}. Ejecuta la acción para el botón de arriba
     * del lado contrario a los direccionales (X,Y,O,A, etc...).
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonLeftAction(final GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                buttonLeftImageNumber++;
                actionSetter.getWindow().runOnUiThread(new Runnable() {
                    public void run() {
                        actionSetter.getComponent().setImageBitmap(GraphicGetter.getGraphic("hand_0" + ((buttonLeftImageNumber % 6) + 1) + ".png", actionSetter.getWindowWidth(), actionSetter.getWindowHeight(), actionSetter.getWindowDivision()));
                    }
                });
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonRightAction}. Ejecuta la acción para el botón de arriba
     * del lado contrario a los direccionales (X,Y,O,A, etc...).
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonRightAction(final GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                buttonRightImageNumber++;
                actionSetter.getWindow().runOnUiThread(new Runnable() {
                    public void run() {
                        actionSetter.getComponent().setImageBitmap(GraphicGetter.getGraphic("punch_0" + ((buttonRightImageNumber % 6) + 1) + ".png", actionSetter.getWindowWidth(), actionSetter.getWindowHeight(), actionSetter.getWindowDivision()));
                    }
                });
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonUpAction}. Ejecuta la acción para el botón de arriba del
     * lado contrario a los direccionales (X,Y,O,A, etc...).
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonUpAction(final GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                buttonUpImageNumber++;
                actionSetter.getWindow().runOnUiThread(new Runnable() {
                    public void run() {
                        actionSetter.getComponent().setImageBitmap(GraphicGetter.getGraphic("good_0" + ((buttonUpImageNumber % 6) + 1) + ".png", actionSetter.getWindowWidth(), actionSetter.getWindowHeight(), actionSetter.getWindowDivision()));
                    }
                });
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }

    /**
     * FIXME: Description of {@code runButtonDownAction}. Ejecuta la acción para el botón de arriba
     * del lado contrario a los direccionales (X,Y,O,A, etc...).
     *
     * @param actionSetter es el asignador de acciones para un joystick.
     * @param buttonState  es el estado del botón.
     */
    public static void runButtonDownAction(final GenericJoystickComponentActionSetter<ExampleActivity, ImageView> actionSetter, byte buttonState) {
        switch (buttonState) {
            case BUTTON_TYPED:
                buttonDownImageNumber++;
                actionSetter.getWindow().runOnUiThread(new Runnable() {
                    public void run() {
                        actionSetter.getComponent().setImageBitmap(GraphicGetter.getGraphic("tick_0" + ((buttonDownImageNumber % 6) + 1) + ".png", actionSetter.getWindowWidth(), actionSetter.getWindowHeight(), actionSetter.getWindowDivision()));
                    }
                });
                break;

            case BUTTON_PRESSED:
                break;

            case BUTTON_RELEASED:
                break;

            case BUTTON_UNPRESSED:
                break;
        }
    }
}
