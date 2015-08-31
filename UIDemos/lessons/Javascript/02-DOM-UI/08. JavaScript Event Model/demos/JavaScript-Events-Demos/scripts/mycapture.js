function attachEventHandlerCapture(element, eventType, eventHandler) {
    if (!element) {
        return null;
    }

    if (document.addEventListener) {
        element.addEventListener(eventType, eventHandler, true);
    } else if (document.attachEvent) {
        element.attachEvent("on" + eventType, eventHandler);
    }
}
