/*
 * @fileoverview {PolyJoystickComponentActionSetter} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {PolyJoystickComponentActionSetter} fue realizada el 31/07/2022.
 * @Dev - La primera version de {PolyJoystickComponentActionSetter} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.example.joystick.mobile.setter;

import android.widget.ImageView;

import com.project.dev.joystick.button.GenericButtonActionListener;
import com.project.dev.joystick.name.generic.GenericJoystick;
import com.project.dev.joystick.name.poly.PolyJoystick;

import com.project.dev.example.joystick.mobile.activity.ExampleActivity;
import com.project.dev.example.joystick.mobile.buttonaction.ButtonAction;

/**
 * TODO: Definición de {@code PolyJoystickComponentActionSetter}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class PolyJoystickComponentActionSetter extends GenericJoystickComponentActionSetter<ExampleActivity, ImageView> {

    /**
     * TODO: Definición de {@code PolyJoystickComponentActionSetter}.
     *
     * @param component      es un componente gráfico que será controlado por el joystick
     * @param window
     * @param windowWidth    es el ancho máximo de la ventana donde se moverá el componente gráfico.
     * @param windowHeight   Es el alto máximo de la ventana donde se moverá el componente gráfico.
     * @param windowDivision
     */
    public PolyJoystickComponentActionSetter(ImageView component, ExampleActivity window, int windowWidth, int windowHeight, int windowDivision) {
        super(component, window, windowWidth, windowHeight, windowDivision);
    }

    /**
     * FIXME: Definición de {@code setButtonActions}. Asigna acciones a un joystick.
     *
     * @param joystick es el joystick que controlará el componente.
     * @throws java.lang.Exception si no es posible asignar acciones al joystick indicado.
     */
    @Override
    public void setButtonActions(GenericJoystick joystick) throws Exception {
        if (!(joystick instanceof PolyJoystick))
            throw new Exception("This method is only allowed for PolyJoystick");

        joystick.getButton(PolyJoystick.BUTTON_START_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonStartAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonStartAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonStartAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonStartAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_SELECT_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonSelectAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonSelectAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonSelectAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonSelectAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_LEFT_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonMoveLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonMoveLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonMoveLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonMoveLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_RIGHT_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonMoveRightAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonMoveRightAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonMoveRightAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonMoveRightAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_UP_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonMoveUpAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonMoveUpAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonMoveUpAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonMoveUpAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_DOWN_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonMoveDownAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonMoveDownAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonMoveDownAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonMoveDownAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_SQUARE_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonLeftAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_CIRCLE_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonRightAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonRightAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonRightAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonRightAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_TRIANGLE_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonUpAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonUpAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonUpAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonUpAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });

        joystick.getButton(PolyJoystick.BUTTON_EKS_NAME).setOnActionListener(new GenericButtonActionListener() {
            @Override
            public void onTyped() {
                ButtonAction.runButtonDownAction(PolyJoystickComponentActionSetter.this, BUTTON_TYPED);
            }

            @Override
            public void onPressed() {
                ButtonAction.runButtonDownAction(PolyJoystickComponentActionSetter.this, BUTTON_PRESSED);
            }

            @Override
            public void onReleased() {
                ButtonAction.runButtonDownAction(PolyJoystickComponentActionSetter.this, BUTTON_RELEASED);
            }

            @Override
            public void onUnpressed() {
                ButtonAction.runButtonDownAction(PolyJoystickComponentActionSetter.this, BUTTON_UNPRESSED);
            }
        });
    }
}
