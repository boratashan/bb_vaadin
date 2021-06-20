import '@vaadin/vaadin-grid';
import { customElement, html, LitElement } from 'lit-element';

@customElement('card-list-view')
export class CardListView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html`<vaadin-grid id="grid" theme="no-border no-row-borders"> </vaadin-grid>`;
  }
}
