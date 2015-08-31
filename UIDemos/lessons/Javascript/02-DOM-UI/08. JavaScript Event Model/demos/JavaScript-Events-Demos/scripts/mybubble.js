function attachEventHandlerBubble(element, eventType, eventHandler) {
    if (!element) {
        return null;
    }

    if (document.addEventListener) {
        element.addEventListener(eventType, eventHandler, false);
    } else if (document.attachEvent) {
        element.attachEvent("on" + eventType, eventHandler);
    }
}
